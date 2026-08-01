use crate::Context;
use crate::platform::{find_executable, run_shell, shell_quote};
use std::fmt;
use std::fs;
use std::path::Path;

#[derive(Clone, Copy, Debug, Eq, PartialEq)]
pub enum RootType {
    Magisk,
    KernelSuSusfs,
    KernelSuJailbreak,
    KernelSu,
    APatch,
    Unknown,
}

impl fmt::Display for RootType {
    fn fmt(&self, formatter: &mut fmt::Formatter<'_>) -> fmt::Result {
        formatter.write_str(match self {
            Self::Magisk => "Magisk",
            Self::KernelSuSusfs => "KernelSU_SUSFS",
            Self::KernelSuJailbreak => "KernelSU_越狱",
            Self::KernelSu => "KernelSU",
            Self::APatch => "APatch",
            Self::Unknown => "Unknown",
        })
    }
}

#[derive(Clone, Copy, Debug, Eq, PartialEq)]
pub enum BootState {
    Locked,
    Unlocked,
    Unknown,
}

pub fn detect(ctx: &Context) -> RootType {
    if let Ok(value) = std::env::var("YH_ROOT_TYPE") {
        return match value.to_ascii_lowercase().as_str() {
            "magisk" => RootType::Magisk,
            "kernelsu_susfs" | "ksu_susfs" => RootType::KernelSuSusfs,
            "kernelsu_jailbreak" | "ksu_jailbreak" => RootType::KernelSuJailbreak,
            "kernelsu" | "ksu" => RootType::KernelSu,
            "apatch" => RootType::APatch,
            _ => RootType::Unknown,
        };
    }
    if Path::new("/data/adb/magisk").exists() || Path::new("/data/adb/magisk.db").exists() {
        return RootType::Magisk;
    }
    if Path::new("/data/adb/ap").exists() || Path::new("/data/adb/apatch").exists() {
        return RootType::APatch;
    }
    if Path::new("/data/adb/ksu").exists() {
        if susfs_binary().is_some() || Path::new("/sys/kernel/susfs").exists() {
            return RootType::KernelSuSusfs;
        }
        if ctx.work_dir.join("conf/ksu_jailbreak").exists() || Path::new("/data/adb/ksu/.jailbreak").exists() {
            return RootType::KernelSuJailbreak;
        }
        return RootType::KernelSu;
    }
    RootType::Unknown
}

pub fn susfs_binary() -> Option<std::path::PathBuf> {
    find_executable(&[
        "/data/adb/ksu/bin/ksu_susfs",
        "/data/adb/ksu/bin/susfs",
        "/data/adb/ap/bin/ksu_susfs",
    ])
}

pub fn boot_state(ctx: &Context) -> BootState {
    let mut text = String::new();
    for path in ["/proc/cmdline", "/proc/bootconfig"] {
        if let Ok(value) = fs::read_to_string(path) {
            text.push_str(&value);
            text.push('\n');
        }
    }
    let lowered = text.to_ascii_lowercase();
    if lowered.contains("androidboot.verifiedbootstate=orange")
        || lowered.contains("androidboot.verifiedbootstate=yellow")
        || lowered.contains("androidboot.flash.locked=0")
    {
        return BootState::Unlocked;
    }
    if lowered.contains("androidboot.verifiedbootstate=green")
        || lowered.contains("androidboot.flash.locked=1")
    {
        return BootState::Locked;
    }
    let command = "getprop ro.boot.verifiedbootstate";
    if let Ok(result) = run_shell(ctx, command) {
        return match result.stdout.trim().to_ascii_lowercase().as_str() {
            "orange" | "yellow" => BootState::Unlocked,
            "green" => BootState::Locked,
            _ => BootState::Unknown,
        };
    }
    BootState::Unknown
}

pub fn package_uid(ctx: &Context, package: &str) -> Result<u32, String> {
    let command = format!("cmd package list packages -U {}", shell_quote(package));
    let output = run_shell(ctx, &command).map_err(|error| error.to_string())?;
    if !output.success() {
        return Err(output.stderr.trim().to_owned());
    }
    for token in output.stdout.split_whitespace() {
        if let Some(value) = token.strip_prefix("uid:") {
            if let Ok(uid) = value.parse() {
                return Ok(uid);
            }
        }
    }
    Err(format!("package UID not found: {package}"))
}

