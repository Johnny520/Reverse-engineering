use crate::config::Config;
use crate::platform::{append_log, copy_atomic, is_valid_package, run_shell, shell_quote};
use crate::root::{self, BootState, RootType};
use crate::{Context, VERSION};
use std::fs;
use std::io;
use std::path::{Path, PathBuf};

pub type ActionResult<T = ()> = Result<T, String>;

pub fn initialize(ctx: &Context) -> ActionResult {
    ensure_layout(ctx).map_err(|error| error.to_string())?;
    let config = Config::load(&ctx.config_path()).map_err(|error| error.to_string())?;
    config.save(&ctx.config_path()).map_err(|error| error.to_string())?;
    println!("月虹一键隐藏 clean core v{VERSION}");
    println!("工作目录: {}", ctx.work_dir.display());
    println!("Root 类型: {}", root::detect(ctx));
    configure_hide(ctx)?;
    Ok(())
}

pub fn ensure_layout(ctx: &Context) -> io::Result<()> {
    for path in [
        ctx.work_dir.join("conf"),
        ctx.work_dir.join("pkg"),
        ctx.work_dir.join("log"),
        ctx.work_dir.join("run"),
        ctx.work_dir.join("inbox"),
        ctx.work_dir.join("active"),
        ctx.work_dir.join("backup"),
    ] {
        fs::create_dir_all(path)?;
    }
    if !ctx.packages_path().exists() {
        fs::write(ctx.packages_path(), b"")?;
    }
    let sus_paths = ctx.work_dir.join("conf/sus_paths.txt");
    if !sus_paths.exists() {
        let defaults = format!(
            "# type:absolute-path\npath:{}\npath:{}\n",
            ctx.work_dir.display(),
            ctx.module_dir.display()
        );
        fs::write(sus_paths, defaults)?;
    }
    Ok(())
}

pub fn status(ctx: &Context) -> ActionResult<String> {
    let root_type = root::detect(ctx);
    let boot_state = root::boot_state(ctx);
    let config = Config::load(&ctx.config_path()).map_err(|error| error.to_string())?;
    let can_integrity = root_type != RootType::Unknown;
    let can_sus = root::susfs_binary().is_some() || Path::new("/sys/kernel/susfs").exists();
    let boot = match boot_state {
        BootState::Locked => "LOCKED",
        BootState::Unlocked => "UNLOCKED",
        BootState::Unknown => "UNKNOWN",
    };
    Ok(format!(
        "YH_VERSION={VERSION}\nYH_ROOT_TYPE={root_type}\nYH_BOOT_STATE={boot}\nYH_CAN_INTEGRITY={}\nYH_CAN_CONFIG_SUS={}\nYH_AUTO_KEY={}\nYH_AUTO_BL={}\nYH_AUTO_DEBUG={}\nYH_WORK_DIR={}\nYH_MODULE_DIR={}\n",
        usize::from(can_integrity),
        usize::from(can_sus),
        on_off(config.bool("zdyxmy")),
        on_off(config.bool("zdbl")),
        on_off(config.bool("zdgbkfq")),
        ctx.work_dir.display(),
        ctx.module_dir.display(),
    ))
}

pub fn report(ctx: &Context) -> ActionResult {
    ensure_layout(ctx).map_err(|error| error.to_string())?;
    let text = status(ctx)?;
    print!("{text}");
    fs::write(ctx.log_dir().join("report.txt"), text).map_err(|error| error.to_string())
}

pub fn set_toggle(ctx: &Context, key: &str, value: &str) -> ActionResult {
    if !matches!(value, "on" | "off") {
        return Err("toggle value must be on or off".to_owned());
    }
    ensure_layout(ctx).map_err(|error| error.to_string())?;
    let mut config = Config::load(&ctx.config_path()).map_err(|error| error.to_string())?;
    config.set(key, value)?;
    config.save(&ctx.config_path()).map_err(|error| error.to_string())?;
    println!("{key}={value}");
    Ok(())
}

pub fn configure_hide(ctx: &Context) -> ActionResult {
    ensure_layout(ctx).map_err(|error| error.to_string())?;
    let config = Config::load(&ctx.config_path()).map_err(|error| error.to_string())?;
    println!("[*] 应用隐藏配置...");
    if config.bool("spoof_boot") {
        for (key, value) in [
            ("ro.boot.verifiedbootstate", "green"),
            ("ro.boot.flash.locked", "1"),
            ("ro.boot.vbmeta.device_state", "locked"),
        ] {
            reset_property(ctx, key, value)?;
        }
        let hash_path = ctx.work_dir.join("vbmeta.hash");
        if hash_path.exists() {
            let value = fs::read_to_string(&hash_path).map_err(|error| error.to_string())?;
            let value = value.trim();
            if valid_hash(value) {
                reset_property(ctx, "ro.boot.vbmeta.digest", value)?;
            } else {
                return Err(format!("invalid vbmeta hash in {}", hash_path.display()));
            }
        }
    }
    apply_package_rules(ctx, &ctx.packages_path())?;
    println!("[+] 隐藏配置已应用");
    Ok(())
}

pub fn apply_package_rules(ctx: &Context, source: &Path) -> ActionResult {
    ensure_layout(ctx).map_err(|error| error.to_string())?;
    let packages = read_packages(source)?;
    if source != ctx.packages_path() {
        let text = packages.join("\n") + if packages.is_empty() { "" } else { "\n" };
        fs::write(ctx.packages_path(), text).map_err(|error| error.to_string())?;
    }

    let root_type = root::detect(ctx);
    let config = Config::load(&ctx.config_path()).map_err(|error| error.to_string())?;
    println!("[*] 应用 {} 个风险应用规则", packages.len());
    for package in &packages {
        match root_type {
            RootType::Magisk => {
                let command = format!("magisk --denylist add {}", shell_quote(package));
                command_checked(ctx, &command, "Magisk DenyList")?;
            }
            RootType::KernelSuSusfs => {
                // KernelSU controls per-app root policy in the manager. SUSFS hides global root paths.
                println!("[i] KernelSU package rule recorded: {package}");
            }
            _ => println!("[i] package rule recorded: {package}"),
        }
        if config.bool("cleanup_external") {
            cleanup_external_cache(package)?;
        }
    }
    Ok(())
}

pub fn configure_sus(ctx: &Context) -> ActionResult {
    let Some(binary) = root::susfs_binary() else {
        return Err("SUSFS command was not found".to_owned());
    };
    let source = ctx.work_dir.join("conf/sus_paths.txt");
    let text = fs::read_to_string(&source).map_err(|error| error.to_string())?;
    let mut applied = 0usize;
    for raw in text.lines() {
        let line = raw.trim();
        if line.is_empty() || line.starts_with('#') {
            continue;
        }
        let (kind, path) = line.split_once(':').unwrap_or(("path", line));
        if !path.starts_with('/') || path.contains(['\r', '\n']) {
            return Err(format!("invalid SUSFS path: {path}"));
        }
        let operation = match kind {
            "path" => "add_sus_path",
            "mount" => "add_sus_mount",
            "kstat" => "add_sus_kstat",
            _ => return Err(format!("unsupported SUSFS rule type: {kind}")),
        };
        let output = crate::platform::run(ctx, &binary, [operation, path])
            .map_err(|error| error.to_string())?;
        if !output.success() {
            return Err(format!("SUSFS {operation} failed: {}", output.stderr.trim()));
        }
        applied += 1;
    }
    println!("[+] SUSFS 规则已应用: {applied}");
    Ok(())
}

pub fn close_debug(ctx: &Context) -> ActionResult {
    println!("[*] 关闭 USB 调试与开发者模式...");
    for command in [
        "settings put global adb_enabled 0",
        "settings put global development_settings_enabled 0",
        "setprop ctl.stop adbd",
    ] {
        command_checked(ctx, command, "close debug")?;
    }
    reset_property(ctx, "ro.debuggable", "0")?;
    println!("[+] 调试模式已关闭");
    Ok(())
}

pub fn import_local_key(ctx: &Context) -> ActionResult {
    let source = ctx.inbox_dir().join("keybox.xml");
    let text = fs::read_to_string(&source)
        .map_err(|error| format!("{}: {error}", source.display()))?;
    if !text.contains("<Keybox") && !text.contains("<AndroidAttestation") {
        return Err("keybox.xml does not contain a supported keybox root element".to_owned());
    }
    let active = ctx.work_dir.join("active/keybox.xml");
    copy_atomic(&source, &active).map_err(|error| error.to_string())?;
    let tricky_store = Path::new("/data/adb/tricky_store");
    if tricky_store.exists() {
        backup_if_present(ctx, &tricky_store.join("keybox.xml"))?;
        copy_atomic(&source, &tricky_store.join("keybox.xml")).map_err(|error| error.to_string())?;
        println!("[+] 密钥已导入 Tricky Store");
    } else {
        println!("[+] 密钥已保存到 {}", active.display());
    }
    Ok(())
}

pub fn import_local_bl(ctx: &Context) -> ActionResult {
    let inbox = ctx.inbox_dir();
    let active = ctx.work_dir.join("active");
    fs::create_dir_all(&active).map_err(|error| error.to_string())?;
    let mut copied = 0usize;
    for name in ["target.txt", "security_patch.txt", "bl.list"] {
        let source = inbox.join(name);
        if !source.exists() {
            continue;
        }
        copy_atomic(&source, &active.join(name)).map_err(|error| error.to_string())?;
        let tricky_store = Path::new("/data/adb/tricky_store");
        if tricky_store.exists() && name != "bl.list" {
            backup_if_present(ctx, &tricky_store.join(name))?;
            copy_atomic(&source, &tricky_store.join(name)).map_err(|error| error.to_string())?;
        }
        copied += 1;
    }
    if copied == 0 {
        return Err(format!("no local BL files found in {}", inbox.display()));
    }
    println!("[+] 本地 BL 文件已更新: {copied}");
    Ok(())
}

pub fn grant_magisk_root(ctx: &Context, package: &str) -> ActionResult {
    if !is_valid_package(package) {
        return Err(format!("invalid package name: {package}"));
    }
    if root::detect(ctx) != RootType::Magisk {
        return Err("Magisk root policy is not active".to_owned());
    }
    let uid = root::package_uid(ctx, package)?;
    let sql = format!(
        "REPLACE INTO policies (uid,policy,until,logging,notification) VALUES ({uid},2,0,1,1);"
    );
    let command = format!("magisk --sqlite {}", shell_quote(&sql));
    command_checked(ctx, &command, "Magisk root grant")?;
    println!("[+] Root 授权成功: {package} (uid={uid})");
    Ok(())
}

pub fn fix_lsp(ctx: &Context) -> ActionResult {
    let modules = Path::new("/data/adb/modules");
    let mut fixed = 0usize;
    let entries = fs::read_dir(modules).map_err(|error| error.to_string())?;
    for entry in entries.flatten() {
        let path = entry.path();
        let prop = path.join("module.prop");
        let Ok(text) = fs::read_to_string(prop) else {
            continue;
        };
        let lowered = text.to_ascii_lowercase();
        if !lowered.contains("lsposed") && !lowered.contains("zygisk") && !lowered.contains("lsp") {
            continue;
        }
        let disable = path.join("disable");
        if disable.exists() {
            fs::remove_file(disable).map_err(|error| error.to_string())?;
        }
        let command = format!("chmod -R 0755 {}", shell_quote(&path.to_string_lossy()));
        command_checked(ctx, &command, "fix module permissions")?;
        fixed += 1;
    }
    println!("[+] Zygisk/LSP 模块检查完成: {fixed}");
    Ok(())
}

pub fn reload(ctx: &Context) -> ActionResult {
    configure_hide(ctx)?;
    if root::susfs_binary().is_some() {
        configure_sus(ctx)?;
    }
    fs::write(ctx.work_dir.join("run/reload.stamp"), crate::platform::unix_time().to_string())
        .map_err(|error| error.to_string())?;
    println!("[+] 模块规则已重载");
    Ok(())
}

fn reset_property(ctx: &Context, key: &str, value: &str) -> ActionResult {
    if !key.bytes().all(|byte| byte.is_ascii_alphanumeric() || matches!(byte, b'.' | b'_')) {
        return Err(format!("invalid property name: {key}"));
    }
    let command = format!("resetprop {} {}", shell_quote(key), shell_quote(value));
    let output = run_shell(ctx, &command).map_err(|error| error.to_string())?;
    if output.success() {
        return Ok(());
    }
    let fallback = format!("setprop {} {}", shell_quote(key), shell_quote(value));
    command_checked(ctx, &fallback, "set property")
}

fn command_checked(ctx: &Context, command: &str, label: &str) -> ActionResult {
    let output = run_shell(ctx, command).map_err(|error| error.to_string())?;
    if !output.stdout.trim().is_empty() {
        print!("{}", output.stdout);
    }
    if output.success() {
        Ok(())
    } else {
        Err(format!("{label} failed ({}): {}", output.code, output.stderr.trim()))
    }
}

fn read_packages(path: &Path) -> ActionResult<Vec<String>> {
    let text = fs::read_to_string(path).map_err(|error| format!("{}: {error}", path.display()))?;
    let mut packages = Vec::new();
    for raw in text.lines() {
        let package = raw.trim();
        if package.is_empty() || package.starts_with('#') {
            continue;
        }
        if !is_valid_package(package) {
            return Err(format!("invalid package name in {}: {package}", path.display()));
        }
        if !packages.iter().any(|known| known == package) {
            packages.push(package.to_owned());
        }
    }
    Ok(packages)
}

fn cleanup_external_cache(package: &str) -> ActionResult {
    for leaf in ["cache", "code_cache"] {
        let path = PathBuf::from(format!("/sdcard/Android/data/{package}/{leaf}"));
        if path.exists() {
            fs::remove_dir_all(&path).map_err(|error| format!("{}: {error}", path.display()))?;
        }
    }
    Ok(())
}

fn backup_if_present(ctx: &Context, path: &Path) -> ActionResult {
    if !path.exists() {
        return Ok(());
    }
    let name = path.file_name().and_then(|value| value.to_str()).unwrap_or("backup.bin");
    let destination = ctx.work_dir.join("backup").join(format!("{}.{}", name, crate::platform::unix_time()));
    copy_atomic(path, &destination).map_err(|error| error.to_string())
}

fn valid_hash(value: &str) -> bool {
    matches!(value.len(), 32 | 40 | 64 | 96 | 128) && value.bytes().all(|byte| byte.is_ascii_hexdigit())
}

fn on_off(value: bool) -> &'static str {
    if value { "on" } else { "off" }
}

pub fn log_action(ctx: &Context, line: &str) {
    let _ = append_log(&ctx.log_dir().join("daemon.log"), line);
}

#[cfg(test)]
mod tests {
    use super::{read_packages, valid_hash};
    use std::fs;

    #[test]
    fn validates_hashes() {
        assert!(valid_hash(&"a".repeat(64)));
        assert!(!valid_hash("not-a-hash"));
    }

    #[test]
    fn reads_unique_packages() {
        let path = std::env::temp_dir().join(format!("yh-packages-{}.txt", std::process::id()));
        fs::write(&path, "com.example.one\ncom.example.one\ncom.example.two\n").unwrap();
        let values = read_packages(&path).unwrap();
        assert_eq!(values, ["com.example.one", "com.example.two"]);
        let _ = fs::remove_file(path);
    }
}

