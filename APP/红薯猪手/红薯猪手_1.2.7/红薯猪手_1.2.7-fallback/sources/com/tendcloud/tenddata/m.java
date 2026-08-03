package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class m extends java.io.File {
    public final java.lang.String content;

    public static class a extends com.tendcloud.tenddata.m {
        public java.util.ArrayList<com.tendcloud.tenddata.m.b> groups;

        private a(java.lang.String r6) {
                r5 = this;
                r5.<init>(r6)
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25
                r6.<init>()     // Catch: java.lang.Throwable -> L25
                r5.groups = r6     // Catch: java.lang.Throwable -> L25
                java.lang.String r6 = r5.content     // Catch: java.lang.Throwable -> L25
                java.lang.String r0 = "\n"
                java.lang.String[] r6 = r6.split(r0)     // Catch: java.lang.Throwable -> L25
                int r0 = r6.length     // Catch: java.lang.Throwable -> L25
                r1 = 0
            L14:
                if (r1 >= r0) goto L25
                r2 = r6[r1]     // Catch: java.lang.Throwable -> L25
                java.util.ArrayList<com.tendcloud.tenddata.m$b> r3 = r5.groups     // Catch: java.lang.Throwable -> L22
                com.tendcloud.tenddata.m$b r4 = new com.tendcloud.tenddata.m$b     // Catch: java.lang.Throwable -> L22
                r4.<init>(r2)     // Catch: java.lang.Throwable -> L22
                r3.add(r4)     // Catch: java.lang.Throwable -> L22
            L22:
                int r1 = r1 + 1
                goto L14
            L25:
                return
        }

        public static com.tendcloud.tenddata.m.a get(int r4) {
                com.tendcloud.tenddata.m$a r0 = new com.tendcloud.tenddata.m$a     // Catch: java.lang.Throwable -> L16
                java.lang.String r1 = "/proc/%d/cgroup"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L16
                r3 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L16
                r2[r3] = r4     // Catch: java.lang.Throwable -> L16
                java.lang.String r4 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L16
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L16
                return r0
            L16:
                r4 = 0
                return r4
        }

        public com.tendcloud.tenddata.m.b getGroup(java.lang.String r7) {
                r6 = this;
                java.util.ArrayList<com.tendcloud.tenddata.m$b> r0 = r6.groups     // Catch: java.lang.Throwable -> L2a
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
            L6:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
                if (r1 == 0) goto L2a
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2a
                com.tendcloud.tenddata.m$b r1 = (com.tendcloud.tenddata.m.b) r1     // Catch: java.lang.Throwable -> L2a
                java.lang.String r2 = r1.subsystems     // Catch: java.lang.Throwable -> L2a
                java.lang.String r3 = ","
                java.lang.String[] r2 = r2.split(r3)     // Catch: java.lang.Throwable -> L2a
                int r3 = r2.length     // Catch: java.lang.Throwable -> L2a
                r4 = 0
            L1c:
                if (r4 >= r3) goto L6
                r5 = r2[r4]     // Catch: java.lang.Throwable -> L2a
                boolean r5 = r5.equals(r7)     // Catch: java.lang.Throwable -> L2a
                if (r5 == 0) goto L27
                return r1
            L27:
                int r4 = r4 + 1
                goto L1c
            L2a:
                r7 = 0
                return r7
        }
    }

    public static class b {
        public java.lang.String group;
        public int id;
        public java.lang.String subsystems;

        public b(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()     // Catch: java.lang.Throwable -> L15
                r1.id = r0     // Catch: java.lang.Throwable -> L15
                java.lang.String r0 = r2.readString()     // Catch: java.lang.Throwable -> L15
                r1.subsystems = r0     // Catch: java.lang.Throwable -> L15
                java.lang.String r2 = r2.readString()     // Catch: java.lang.Throwable -> L15
                r1.group = r2     // Catch: java.lang.Throwable -> L15
            L15:
                return
        }

        public b(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ":"
                java.lang.String[] r2 = r2.split(r0)     // Catch: java.lang.Throwable -> L1c
                r0 = 0
                r0 = r2[r0]     // Catch: java.lang.Throwable -> L1c
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L1c
                r1.id = r0     // Catch: java.lang.Throwable -> L1c
                r0 = 1
                r0 = r2[r0]     // Catch: java.lang.Throwable -> L1c
                r1.subsystems = r0     // Catch: java.lang.Throwable -> L1c
                r0 = 2
                r2 = r2[r0]     // Catch: java.lang.Throwable -> L1c
                r1.group = r2     // Catch: java.lang.Throwable -> L1c
            L1c:
                return
        }
    }

    public static class c extends com.tendcloud.tenddata.m {
        private java.lang.String[] fields;

        private c(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                java.lang.String[] r0 = new java.lang.String[r0]
                r1.fields = r0
                java.lang.String[] r2 = r2.createStringArray()     // Catch: java.lang.Throwable -> Le
                r1.fields = r2     // Catch: java.lang.Throwable -> Le
            Le:
                return
        }

        private c(java.lang.String r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                java.lang.String[] r2 = new java.lang.String[r2]
                r1.fields = r2
                java.lang.String r2 = r1.content     // Catch: java.lang.Throwable -> L12
                java.lang.String r0 = "\\s+"
                java.lang.String[] r2 = r2.split(r0)     // Catch: java.lang.Throwable -> L12
                r1.fields = r2     // Catch: java.lang.Throwable -> L12
            L12:
                return
        }

        public static com.tendcloud.tenddata.m.c get(int r4) {
                com.tendcloud.tenddata.m$c r0 = new com.tendcloud.tenddata.m$c     // Catch: java.lang.Throwable -> L16
                java.lang.String r1 = "/proc/%d/stat"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L16
                r3 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L16
                r2[r3] = r4     // Catch: java.lang.Throwable -> L16
                java.lang.String r4 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L16
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L16
                return r0
            L16:
                r4 = 0
                return r4
        }

        public java.lang.String getComm() {
                r3 = this;
                java.lang.String r0 = ""
                java.lang.String[] r1 = r3.fields     // Catch: java.lang.Throwable -> L13
                r2 = 1
                r1 = r1[r2]     // Catch: java.lang.Throwable -> L13
                java.lang.String r2 = "("
                java.lang.String r1 = r1.replace(r2, r0)     // Catch: java.lang.Throwable -> L13
                java.lang.String r2 = ")"
                java.lang.String r0 = r1.replace(r2, r0)     // Catch: java.lang.Throwable -> L13
            L13:
                return r0
        }

        public long startTime() {
                r2 = this;
                java.lang.String[] r0 = r2.fields     // Catch: java.lang.Throwable -> Lb
                r1 = 21
                r0 = r0[r1]     // Catch: java.lang.Throwable -> Lb
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> Lb
                return r0
            Lb:
                r0 = 0
                return r0
        }

        public char state() {
                r3 = this;
                r0 = 0
                java.lang.String[] r1 = r3.fields     // Catch: java.lang.Throwable -> La
                r2 = 2
                r1 = r1[r2]     // Catch: java.lang.Throwable -> La
                char r0 = r1.charAt(r0)     // Catch: java.lang.Throwable -> La
            La:
                return r0
        }
    }

    public static class d extends com.tendcloud.tenddata.m {
        private d(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private d(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static com.tendcloud.tenddata.m.d get(int r4) {
                com.tendcloud.tenddata.m$d r0 = new com.tendcloud.tenddata.m$d     // Catch: java.lang.Throwable -> L16
                java.lang.String r1 = "/proc/%d/status"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L16
                r3 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L16
                r2[r3] = r4     // Catch: java.lang.Throwable -> L16
                java.lang.String r4 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L16
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L16
                return r0
            L16:
                r4 = 0
                return r4
        }

        public int getGid() {
                r2 = this;
                java.lang.String r0 = "Gid"
                java.lang.String r0 = r2.getValue(r0)     // Catch: java.lang.Throwable -> L14
                java.lang.String r1 = "\\s+"
                java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> L14
                r1 = 0
                r0 = r0[r1]     // Catch: java.lang.Throwable -> L14
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L14
                return r0
            L14:
                r0 = -1
                return r0
        }

        public int getUid() {
                r2 = this;
                java.lang.String r0 = "Uid"
                java.lang.String r0 = r2.getValue(r0)     // Catch: java.lang.Throwable -> L14
                java.lang.String r1 = "\\s+"
                java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> L14
                r1 = 0
                r0 = r0[r1]     // Catch: java.lang.Throwable -> L14
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L14
                return r0
            L14:
                r0 = -1
                return r0
        }

        public java.lang.String getValue(java.lang.String r7) {
                r6 = this;
                java.lang.String r0 = ":"
                java.lang.String r1 = r6.content     // Catch: java.lang.Throwable -> L43
                java.lang.String r2 = "\n"
                java.lang.String[] r1 = r1.split(r2)     // Catch: java.lang.Throwable -> L43
                int r2 = r1.length     // Catch: java.lang.Throwable -> L43
                r3 = 0
            Lc:
                if (r3 >= r2) goto L43
                r4 = r1[r3]     // Catch: java.lang.Throwable -> L43
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
                r5.<init>()     // Catch: java.lang.Throwable -> L43
                r5.append(r7)     // Catch: java.lang.Throwable -> L43
                r5.append(r0)     // Catch: java.lang.Throwable -> L43
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L43
                boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> L43
                if (r5 == 0) goto L40
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
                r1.<init>()     // Catch: java.lang.Throwable -> L43
                r1.append(r7)     // Catch: java.lang.Throwable -> L43
                r1.append(r0)     // Catch: java.lang.Throwable -> L43
                java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L43
                java.lang.String[] r7 = r4.split(r7)     // Catch: java.lang.Throwable -> L43
                r0 = 1
                r7 = r7[r0]     // Catch: java.lang.Throwable -> L43
                java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L43
                return r7
            L40:
                int r3 = r3 + 1
                goto Lc
            L43:
                r7 = 0
                return r7
        }
    }

    public m(android.os.Parcel r2) {
            r1 = this;
            java.lang.String r0 = r2.readString()
            r1.<init>(r0)
            java.lang.String r2 = r2.readString()
            r1.content = r2
            return
    }

    public m(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = readFile(r1)
            r0.content = r1
            return
    }

    public static java.lang.String readFile(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3e
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3e
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = ""
        L16:
            if (r4 == 0) goto L35
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            r0.append(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "\n"
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L3d
            r3 = 104857600(0x6400000, float:3.6111186E-35)
            if (r4 > r3) goto L2d
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L3d
            goto L16
        L2d:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "Input stream more than 100 MB size limit"
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            throw r4     // Catch: java.lang.Throwable -> L3d
        L35:
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L3d
            r2.close()     // Catch: java.lang.Throwable -> L3c
        L3c:
            return r4
        L3d:
            r1 = r2
        L3e:
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L47
            r1.close()     // Catch: java.lang.Throwable -> L47
        L47:
            return r4
        L48:
            r4 = move-exception
            if (r1 == 0) goto L4e
            r1.close()     // Catch: java.lang.Throwable -> L4e
        L4e:
            throw r4
    }

    @Override // java.io.File
    public long length() {
            r2 = this;
            java.lang.String r0 = r2.content
            int r0 = r0.length()
            long r0 = (long) r0
            return r0
    }
}
