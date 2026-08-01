pub mod actions;
pub mod config;
pub mod daemon;
pub mod platform;
pub mod root;

use std::env;
use std::path::PathBuf;

pub const VERSION: &str = "5.4.4-clean";
pub const DEFAULT_WORK_DIR: &str = "/data/adb/YH/YH_YC";
pub const DEFAULT_MODULE_DIR: &str = "/data/adb/modules/YH_YC";

#[derive(Clone, Debug)]
pub struct Context {
    pub work_dir: PathBuf,
    pub module_dir: PathBuf,
    pub dry_run: bool,
}

impl Context {
    pub fn from_env() -> Self {
        Self {
            work_dir: env::var_os("YH_WORK_DIR")
                .map(PathBuf::from)
                .unwrap_or_else(|| PathBuf::from(DEFAULT_WORK_DIR)),
            module_dir: env::var_os("YH_MODULE_DIR")
                .map(PathBuf::from)
                .unwrap_or_else(|| PathBuf::from(DEFAULT_MODULE_DIR)),
            dry_run: env::var("YH_DRY_RUN").is_ok_and(|value| {
                matches!(value.as_str(), "1" | "true" | "on")
            }),
        }
    }

    pub fn config_path(&self) -> PathBuf {
        self.work_dir.join("conf/config.prop")
    }

    pub fn packages_path(&self) -> PathBuf {
        self.work_dir.join("pkg/QT_packages.txt")
    }

    pub fn log_dir(&self) -> PathBuf {
        self.work_dir.join("log")
    }

    pub fn inbox_dir(&self) -> PathBuf {
        self.work_dir.join("inbox")
    }
}

