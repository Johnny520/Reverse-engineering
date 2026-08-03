package Yue;

import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7580 implements InterfaceC7441 {

    /* JADX INFO: renamed from: ۥ۟ */
    public final long f2948;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long f22894;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۨۨ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m1273f = "SharingStarted.kt", m1274i = {1, 2, 3}, m1275l = {178, 180, 182, 183, 185}, m1276m = "invokeSuspend", m1277n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, m1278s = {"L$0", "L$0", "L$0"})
    public static final class C1298 extends AbstractC7690 implements InterfaceC5140<InterfaceC4892<? super EnumC7439>, Integer, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f22895;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f22896;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ int f22897;

        public C1298(InterfaceC4199<? super C1298> interfaceC4199) {
            super(3, interfaceC4199);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC4892 interfaceC4892;
            long j;
            EnumC7439 enumC7439;
            Object objM17142 = C5508.m17142();
            int i = this.f22895;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        interfaceC4892 = (InterfaceC4892) this.f22896;
                        C7149.m22422(obj);
                        if (C7580.this.f22894 > 0) {
                            EnumC7439 enumC74392 = EnumC7439.STOP;
                            this.f22896 = interfaceC4892;
                            this.f22895 = 3;
                            if (interfaceC4892.mo10059(enumC74392, this) == objM17142) {
                                return objM17142;
                            }
                            j = C7580.this.f22894;
                            this.f22896 = interfaceC4892;
                            this.f22895 = 4;
                            if (C4365.m1323(j, this) == objM17142) {
                            }
                        }
                        enumC7439 = EnumC7439.STOP_AND_RESET_REPLAY_CACHE;
                        this.f22896 = null;
                        this.f22895 = 5;
                        if (interfaceC4892.mo10059(enumC7439, this) == objM17142) {
                        }
                    } else if (i == 3) {
                        interfaceC4892 = (InterfaceC4892) this.f22896;
                        C7149.m22422(obj);
                        j = C7580.this.f22894;
                        this.f22896 = interfaceC4892;
                        this.f22895 = 4;
                        if (C4365.m1323(j, this) == objM17142) {
                            return objM17142;
                        }
                        enumC7439 = EnumC7439.STOP_AND_RESET_REPLAY_CACHE;
                        this.f22896 = null;
                        this.f22895 = 5;
                        if (interfaceC4892.mo10059(enumC7439, this) == objM17142) {
                        }
                    } else if (i == 4) {
                        interfaceC4892 = (InterfaceC4892) this.f22896;
                        C7149.m22422(obj);
                        enumC7439 = EnumC7439.STOP_AND_RESET_REPLAY_CACHE;
                        this.f22896 = null;
                        this.f22895 = 5;
                        if (interfaceC4892.mo10059(enumC7439, this) == objM17142) {
                            return objM17142;
                        }
                    } else if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                C7149.m22422(obj);
            } else {
                C7149.m22422(obj);
                interfaceC4892 = (InterfaceC4892) this.f22896;
                if (this.f22897 > 0) {
                    EnumC7439 enumC74393 = EnumC7439.START;
                    this.f22895 = 1;
                    if (interfaceC4892.mo10059(enumC74393, this) == objM17142) {
                        return objM17142;
                    }
                } else {
                    long j2 = C7580.this.f2948;
                    this.f22896 = interfaceC4892;
                    this.f22895 = 2;
                    if (C4365.m1323(j2, this) == objM17142) {
                        return objM17142;
                    }
                    if (C7580.this.f22894 > 0) {
                    }
                    enumC7439 = EnumC7439.STOP_AND_RESET_REPLAY_CACHE;
                    this.f22896 = null;
                    this.f22895 = 5;
                    if (interfaceC4892.mo10059(enumC7439, this) == objM17142) {
                    }
                }
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // Yue.InterfaceC5140
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public /* bridge */ /* synthetic */ Object mo15350(InterfaceC4892<? super EnumC7439> interfaceC4892, Integer num, InterfaceC4199<? super C8107> interfaceC4199) {
            return m23726(interfaceC4892, num.intValue(), interfaceC4199);
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final Object m23726(@InterfaceC6399 InterfaceC4892<? super EnumC7439> interfaceC4892, int i, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            C1298 c1298 = C7580.this.new C1298(interfaceC4199);
            c1298.f22896 = interfaceC4892;
            c1298.f22897 = i;
            return c1298.invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۨۨ$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", m1273f = "SharingStarted.kt", m1274i = {}, m1275l = {}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C1299 extends AbstractC7690 implements InterfaceC5138<EnumC7439, InterfaceC4199<? super Boolean>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f22899;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f22900;

        public C1299(InterfaceC4199<? super C1299> interfaceC4199) {
            super(2, interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C1299 c1299 = new C1299(interfaceC4199);
            c1299.f22900 = obj;
            return c1299;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            C5508.m17142();
            if (this.f22899 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7149.m22422(obj);
            return C3590.m636(((EnumC7439) this.f22900) != EnumC7439.START);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 EnumC7439 enumC7439, @InterfaceC6489 InterfaceC4199<? super Boolean> interfaceC4199) {
            return ((C1299) create(enumC7439, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    public C7580(long j, long j2) {
        this.f2948 = j;
        this.f22894 = j2;
        if (j < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
        }
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C7580) {
            C7580 c7580 = (C7580) obj;
            if (this.f2948 == c7580.f2948 && this.f22894 == c7580.f22894) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f2948) * 31) + Long.hashCode(this.f22894);
    }

    @InterfaceC6399
    public String toString() {
        List listM10714 = C3879.m10714(2);
        if (this.f2948 > 0) {
            listM10714.add("stopTimeout=" + this.f2948 + "ms");
        }
        if (this.f22894 < Long.MAX_VALUE) {
            listM10714.add("replayExpiration=" + this.f22894 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + C3888.m10923(C3879.m917(listM10714), null, null, null, 0, null, null, 63, null) + ')';
    }

    @Override // Yue.InterfaceC7441
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC4890<EnumC7439> mo3633(@InterfaceC6399 InterfaceC7588<Integer> interfaceC7588) {
        return C4896.m15203(C4896.m15207(C4896.m15302(interfaceC7588, new C1298(null)), new C1299(null)));
    }
}
