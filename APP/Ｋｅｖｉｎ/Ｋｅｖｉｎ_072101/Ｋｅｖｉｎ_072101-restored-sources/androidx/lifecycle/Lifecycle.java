package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Lifecycle {
    java.util.concurrent.atomic.AtomicReference<java.lang.Object> mInternalScopeRef;

    /* JADX INFO: renamed from: androidx.lifecycle.Lifecycle$1 */
    static /* synthetic */ class C03181 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event = null;
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State = null;

        static {
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$Event = r0
                r0 = 1
                int[] r1 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L15
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L22
                androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                r2 = 3
                int[] r3 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L2f
                androidx.lifecycle.Lifecycle$Event r4 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch: java.lang.NoSuchFieldError -> L2f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r3 = move-exception
            L30:
                r3 = 4
                int[] r4 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L3c
                androidx.lifecycle.Lifecycle$Event r5 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L3c
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r4 = move-exception
            L3d:
                r4 = 5
                int[] r5 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L49
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r5 = move-exception
            L4a:
                int[] r5 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L56
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L56
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r7 = 6
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r5 = move-exception
            L57:
                int[] r5 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L63
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L63
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r7 = 7
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L63
                goto L64
            L63:
                r5 = move-exception
            L64:
                androidx.lifecycle.Lifecycle$State[] r5 = androidx.lifecycle.Lifecycle.State.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$State = r5
                int[] r5 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L78
                androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.NoSuchFieldError -> L78
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r5[r6] = r0     // Catch: java.lang.NoSuchFieldError -> L78
                goto L79
            L78:
                r0 = move-exception
            L79:
                int[] r0 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L84
                androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.NoSuchFieldError -> L84
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r0[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L84
                goto L85
            L84:
                r0 = move-exception
            L85:
                int[] r0 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L90
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
                goto L91
            L90:
                r0 = move-exception
            L91:
                int[] r0 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L9c
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L9c
                goto L9d
            L9c:
                r0 = move-exception
            L9d:
                int[] r0 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> La8
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> La8
                goto La9
            La8:
                r0 = move-exception
            La9:
                return
        }
    }

    public enum Event extends java.lang.Enum<androidx.lifecycle.Lifecycle.Event> {
        private static final /* synthetic */ androidx.lifecycle.Lifecycle.Event[] $VALUES = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_ANY = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_CREATE = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_DESTROY = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_PAUSE = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_RESUME = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_START = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_STOP = null;

        static {
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_CREATE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_CREATE = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_START"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_START = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_RESUME"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_RESUME = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_PAUSE"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_PAUSE = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_STOP"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_STOP = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_DESTROY"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_DESTROY = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_ANY"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_ANY = r0
                androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                androidx.lifecycle.Lifecycle$Event r4 = androidx.lifecycle.Lifecycle.Event.ON_START
                androidx.lifecycle.Lifecycle$Event r5 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                androidx.lifecycle.Lifecycle$Event r7 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                androidx.lifecycle.Lifecycle$Event r8 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                androidx.lifecycle.Lifecycle$Event r9 = androidx.lifecycle.Lifecycle.Event.ON_ANY
                androidx.lifecycle.Lifecycle$Event[] r0 = new androidx.lifecycle.Lifecycle.Event[]{r3, r4, r5, r6, r7, r8, r9}
                androidx.lifecycle.Lifecycle.Event.$VALUES = r0
                return
        }

        Event(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.lifecycle.Lifecycle.Event downFrom(androidx.lifecycle.Lifecycle.State r2) {
                int[] r0 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$State
                int r1 = r2.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L13;
                    case 2: goto L10;
                    case 3: goto Ld;
                    default: goto Lb;
                }
            Lb:
                r0 = 0
                return r0
            Ld:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                return r0
            L10:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                return r0
            L13:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                return r0
        }

        public static androidx.lifecycle.Lifecycle.Event downTo(androidx.lifecycle.Lifecycle.State r2) {
                int[] r0 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$State
                int r1 = r2.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L13;
                    case 2: goto L10;
                    case 3: goto Lb;
                    case 4: goto Ld;
                    default: goto Lb;
                }
            Lb:
                r0 = 0
                return r0
            Ld:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                return r0
            L10:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                return r0
            L13:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                return r0
        }

        public static androidx.lifecycle.Lifecycle.Event upFrom(androidx.lifecycle.Lifecycle.State r2) {
                int[] r0 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$State
                int r1 = r2.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L13;
                    case 2: goto L10;
                    case 3: goto Lb;
                    case 4: goto Lb;
                    case 5: goto Ld;
                    default: goto Lb;
                }
            Lb:
                r0 = 0
                return r0
            Ld:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                return r0
            L10:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                return r0
            L13:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
                return r0
        }

        public static androidx.lifecycle.Lifecycle.Event upTo(androidx.lifecycle.Lifecycle.State r2) {
                int[] r0 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$State
                int r1 = r2.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L13;
                    case 2: goto L10;
                    case 3: goto Ld;
                    default: goto Lb;
                }
            Lb:
                r0 = 0
                return r0
            Ld:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                return r0
            L10:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
                return r0
            L13:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                return r0
        }

        public static androidx.lifecycle.Lifecycle.Event valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.Lifecycle$Event> r0 = androidx.lifecycle.Lifecycle.Event.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.Lifecycle$Event r0 = (androidx.lifecycle.Lifecycle.Event) r0
                return r0
        }

        public static androidx.lifecycle.Lifecycle.Event[] values() {
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.Lifecycle$Event[] r0 = (androidx.lifecycle.Lifecycle.Event[]) r0
                return r0
        }

        public androidx.lifecycle.Lifecycle.State getTargetState() {
                r3 = this;
                int[] r0 = androidx.lifecycle.Lifecycle.C03181.$SwitchMap$androidx$lifecycle$Lifecycle$Event
                int r1 = r3.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L2d;
                    case 2: goto L2d;
                    case 3: goto L2a;
                    case 4: goto L2a;
                    case 5: goto L27;
                    case 6: goto L24;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r2 = " has no target state"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L24:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
                return r0
            L27:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
                return r0
            L2a:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
                return r0
            L2d:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
                return r0
        }
    }

    public enum State extends java.lang.Enum<androidx.lifecycle.Lifecycle.State> {
        private static final /* synthetic */ androidx.lifecycle.Lifecycle.State[] $VALUES = null;
        public static final androidx.lifecycle.Lifecycle.State CREATED = null;
        public static final androidx.lifecycle.Lifecycle.State DESTROYED = null;
        public static final androidx.lifecycle.Lifecycle.State INITIALIZED = null;
        public static final androidx.lifecycle.Lifecycle.State RESUMED = null;
        public static final androidx.lifecycle.Lifecycle.State STARTED = null;

        static {
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "DESTROYED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.DESTROYED = r0
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "INITIALIZED"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.INITIALIZED = r0
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "CREATED"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.CREATED = r0
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "STARTED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.STARTED = r0
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "RESUMED"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.RESUMED = r0
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
                androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.CREATED
                androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.STARTED
                androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.RESUMED
                androidx.lifecycle.Lifecycle$State[] r0 = new androidx.lifecycle.Lifecycle.State[]{r0, r1, r2, r3, r4}
                androidx.lifecycle.Lifecycle.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.lifecycle.Lifecycle.State valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.Lifecycle$State> r0 = androidx.lifecycle.Lifecycle.State.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                return r0
        }

        public static androidx.lifecycle.Lifecycle.State[] values() {
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.Lifecycle$State[] r0 = (androidx.lifecycle.Lifecycle.State[]) r0
                return r0
        }

        public boolean isAtLeast(androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                int r0 = r1.compareTo(r2)
                if (r0 < 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    public Lifecycle() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.mInternalScopeRef = r0
            return
    }

    public abstract void addObserver(androidx.lifecycle.LifecycleObserver r1);

    public abstract androidx.lifecycle.Lifecycle.State getCurrentState();

    public abstract void removeObserver(androidx.lifecycle.LifecycleObserver r1);
}
