package com.tendcloud.tenddata;

import android.os.Parcel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tendcloud.tenddata.m */
/* JADX INFO: loaded from: classes.dex */
public class C0120m extends File {
    public final String content;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.m$a */
    public static class a extends C0120m {
        public ArrayList<b> groups;

        private a(String str) {
            super(str);
            try {
                this.groups = new ArrayList<>();
                for (String str2 : this.content.split("\n")) {
                    try {
                        this.groups.add(new b(str2));
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }

        public static a get(int i) {
            try {
                return new a(String.format("/proc/%d/cgroup", Integer.valueOf(i)));
            } catch (Throwable unused) {
                return null;
            }
        }

        public b getGroup(String str) {
            try {
                for (b bVar : this.groups) {
                    for (String str2 : bVar.subsystems.split(",")) {
                        if (str2.equals(str)) {
                            return bVar;
                        }
                    }
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.m$b */
    public static class b {
        public String group;

        /* JADX INFO: renamed from: id */
        public int f555id;
        public String subsystems;

        public b(Parcel parcel) {
            try {
                this.f555id = parcel.readInt();
                this.subsystems = parcel.readString();
                this.group = parcel.readString();
            } catch (Throwable unused) {
            }
        }

        public b(String str) {
            try {
                String[] strArrSplit = str.split(":");
                this.f555id = Integer.parseInt(strArrSplit[0]);
                this.subsystems = strArrSplit[1];
                this.group = strArrSplit[2];
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.m$c */
    public static class c extends C0120m {
        private String[] fields;

        private c(Parcel parcel) {
            super(parcel);
            this.fields = new String[0];
            try {
                this.fields = parcel.createStringArray();
            } catch (Throwable unused) {
            }
        }

        private c(String str) {
            super(str);
            this.fields = new String[0];
            try {
                this.fields = this.content.split("\\s+");
            } catch (Throwable unused) {
            }
        }

        public static c get(int i) {
            try {
                return new c(String.format("/proc/%d/stat", Integer.valueOf(i)));
            } catch (Throwable unused) {
                return null;
            }
        }

        public String getComm() {
            try {
                return this.fields[1].replace("(", "").replace(")", "");
            } catch (Throwable unused) {
                return "";
            }
        }

        public long startTime() {
            try {
                return Long.parseLong(this.fields[21]);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public char state() {
            try {
                return this.fields[2].charAt(0);
            } catch (Throwable unused) {
                return (char) 0;
            }
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.m$d */
    public static class d extends C0120m {
        private d(Parcel parcel) {
            super(parcel);
        }

        private d(String str) {
            super(str);
        }

        public static d get(int i) {
            try {
                return new d(String.format("/proc/%d/status", Integer.valueOf(i)));
            } catch (Throwable unused) {
                return null;
            }
        }

        public int getGid() {
            try {
                return Integer.parseInt(getValue("Gid").split("\\s+")[0]);
            } catch (Throwable unused) {
                return -1;
            }
        }

        public int getUid() {
            try {
                return Integer.parseInt(getValue("Uid").split("\\s+")[0]);
            } catch (Throwable unused) {
                return -1;
            }
        }

        public String getValue(String str) {
            try {
                for (String str2 : this.content.split("\n")) {
                    if (str2.startsWith(str + ":")) {
                        return str2.split(str + ":")[1].trim();
                    }
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public C0120m(Parcel parcel) {
        super(parcel.readString());
        this.content = parcel.readString();
    }

    public C0120m(String str) {
        super(str);
        this.content = readFile(str);
    }

    public static String readFile(String str) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            try {
                String str2 = "";
                for (String line = bufferedReader2.readLine(); line != null; line = bufferedReader2.readLine()) {
                    sb.append(str2);
                    sb.append(line);
                    str2 = "\n";
                    if (sb.length() > 104857600) {
                        throw new RuntimeException("Input stream more than 100 MB size limit");
                    }
                }
                String string = sb.toString();
                try {
                    bufferedReader2.close();
                } catch (Throwable unused) {
                }
                return string;
            } catch (Throwable unused2) {
                bufferedReader = bufferedReader2;
                try {
                    String string2 = sb.toString();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    return string2;
                } catch (Throwable th) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable unused5) {
        }
    }

    @Override // java.io.File
    public long length() {
        return this.content.length();
    }
}
