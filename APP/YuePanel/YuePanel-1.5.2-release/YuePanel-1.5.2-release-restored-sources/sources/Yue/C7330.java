package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۡۨۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7330 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f2809 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f2810 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f22149 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f22150 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f22151 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f22152 = 5;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۢ$ۥ */
    @InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,680:1\n26#2:681\n*E\n"})
    public static final class C1232<T> implements InterfaceC7326<T> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC5138 f2811;

        public C1232(InterfaceC5138 interfaceC5138) {
            this.f2811 = interfaceC5138;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<T> iterator() {
            return C7330.m3576(this.f2811);
        }
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ */
    public static <T> Iterator<T> m3576(@InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super AbstractC7328<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        C5499.m17103(interfaceC5138, "block");
        C7327 c7327 = new C7327();
        c7327.m22865(C5501.m17133(interfaceC5138, c7327, c7327));
        return c7327;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ */
    public static <T> InterfaceC7326<T> m3577(@InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super AbstractC7328<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        C5499.m17103(interfaceC5138, "block");
        return new C1232(interfaceC5138);
    }
}
