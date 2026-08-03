package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
public final class C5664 implements java.io.Externalizable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5664.C5665 f20819 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final long f20820 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f20821 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f20822 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public java.util.Collection<?> f20823;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f20824;

    /* JADX INFO: renamed from: Yue.ۥۣۡۨ$ۥ, reason: contains not printable characters */
    public static final class C5665 {
        public C5665() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5665(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥۣۡۨ$ۥ r0 = new Yue.ۥۣۡۨ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5664.f20819 = r0
            return
    }

    public C5664() {
            r2 = this;
            java.util.List r0 = Yue.C1208.m6210()
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public C5664(@Yue.InterfaceC4418 java.util.Collection<?> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "collection"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f20823 = r2
            r1.f20824 = r3
            return
    }

    @Override // java.io.Externalizable
    public void readExternal(@Yue.InterfaceC4418 java.io.ObjectInput r6) {
            r5 = this;
            java.lang.String r0 = "input"
            Yue.C3329.m13906(r6, r0)
            byte r0 = r6.readByte()
            r1 = r0 & 1
            r2 = r0 & (-2)
            r3 = 46
            if (r2 != 0) goto L7d
            int r0 = r6.readInt()
            if (r0 < 0) goto L63
            r2 = 0
            if (r1 == 0) goto L4c
            r4 = 1
            if (r1 != r4) goto L32
            java.util.Set r1 = Yue.C5686.m21251(r0)
        L21:
            if (r2 >= r0) goto L2d
            java.lang.Object r3 = r6.readObject()
            r1.add(r3)
            int r2 = r2 + 1
            goto L21
        L2d:
            java.util.Set r6 = Yue.C5686.m21247(r1)
            goto L60
        L32:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unsupported collection type tag: "
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L4c:
            java.util.List r1 = Yue.C1207.m6189(r0)
        L50:
            if (r2 >= r0) goto L5c
            java.lang.Object r3 = r6.readObject()
            r1.add(r3)
            int r2 = r2 + 1
            goto L50
        L5c:
            java.util.List r6 = Yue.C1207.m6180(r1)
        L60:
            r5.f20823 = r6
            return
        L63:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal size value: "
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L7d:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported flags value: "
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
    }

    @Override // java.io.Externalizable
    public void writeExternal(@Yue.InterfaceC4418 java.io.ObjectOutput r3) {
            r2 = this;
            java.lang.String r0 = "output"
            Yue.C3329.m13906(r3, r0)
            int r0 = r2.f20824
            r3.writeByte(r0)
            java.util.Collection<?> r0 = r2.f20823
            int r0 = r0.size()
            r3.writeInt(r0)
            java.util.Collection<?> r0 = r2.f20823
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            r3.writeObject(r1)
            goto L19
        L27:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object m21232() {
            r1 = this;
            java.util.Collection<?> r0 = r1.f20823
            return r0
    }
}
