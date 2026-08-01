use crate::Context;
use std::ffi::OsStr;
use std::fs;
use std::io;
use std::path::{Path, PathBuf};
use std::process::{Command, Output};
use std::time::{SystemTime, UNIX_EPOCH};

#[derive(Debug)]
pub struct CommandResult {
    pub code: i32,
    pub stdout: String,
    pub stderr: String,
}

impl CommandResult {
    fn from_output(output: Output) -> Self {
        Self {
            code: output.status.code().unwrap_or(128),
            stdout: String::from_utf8_lossy(&output.stdout).into_owned(),
            stderr: String::from_utf8_lossy(&output.stderr).into_owned(),
        }
    }

    pub fn success(&self) -> bool {
        self.code == 0
    }
}

pub fn run<I, S>(ctx: &Context, program: &Path, args: I) -> io::Result<CommandResult>
where
    I: IntoIterator<Item = S>,
    S: AsRef<OsStr>,
{
    let arguments: Vec<_> = args.into_iter().map(|arg| arg.as_ref().to_owned()).collect();
    if ctx.dry_run {
        eprintln!("[dry-run] {} {:?}", program.display(), arguments);
        return Ok(CommandResult { code: 0, stdout: String::new(), stderr: String::new() });
    }
    Command::new(program).args(arguments).output().map(CommandResult::from_output)
}

pub fn run_shell(ctx: &Context, command: &str) -> io::Result<CommandResult> {
    #[cfg(windows)]
    let shell = Path::new("powershell.exe");
    #[cfg(windows)]
    let args = ["-NoProfile", "-Command", command];

    #[cfg(not(windows))]
    let shell = Path::new("/system/bin/sh");
    #[cfg(not(windows))]
    let args = ["-c", command];

    run(ctx, shell, args)
}

pub fn shell_quote(value: &str) -> String {
    format!("'{}'", value.replace('\'', "'\"'\"'"))
}

pub fn find_executable(candidates: &[&str]) -> Option<PathBuf> {
    for candidate in candidates {
        let path = PathBuf::from(candidate);
        if candidate.contains('/') && path.is_file() {
            return Some(path);
        }
    }
    None
}

pub fn copy_atomic(source: &Path, destination: &Path) -> io::Result<()> {
    let parent = destination.parent().unwrap_or_else(|| Path::new("."));
    fs::create_dir_all(parent)?;
    let mut temp_name = destination.as_os_str().to_owned();
    temp_name.push(format!(".tmp.{}", std::process::id()));
    let temp = PathBuf::from(temp_name);
    fs::copy(source, &temp)?;
    if destination.exists() {
        fs::remove_file(destination)?;
    }
    fs::rename(temp, destination)
}

pub fn unix_time() -> u64 {
    SystemTime::now().duration_since(UNIX_EPOCH).unwrap_or_default().as_secs()
}

pub fn append_log(path: &Path, line: &str) -> io::Result<()> {
    use std::io::Write;
    if let Some(parent) = path.parent() {
        fs::create_dir_all(parent)?;
    }
    let mut file = fs::OpenOptions::new().create(true).append(true).open(path)?;
    writeln!(file, "{} {}", unix_time(), line)
}

pub fn is_valid_package(value: &str) -> bool {
    value.contains('.')
        && !value.starts_with('.')
        && !value.ends_with('.')
        && value.bytes().all(|byte| byte.is_ascii_alphanumeric() || matches!(byte, b'_' | b'.'))
}

#[cfg(test)]
mod tests {
    use super::{is_valid_package, shell_quote};

    #[test]
    fn validates_packages() {
        assert!(is_valid_package("com.example.app"));
        assert!(!is_valid_package("com.example;rm"));
        assert!(!is_valid_package("single"));
    }

    #[test]
    fn quotes_shell_values() {
        assert_eq!(shell_quote("a'b"), "'a'\"'\"'b'");
    }
}

