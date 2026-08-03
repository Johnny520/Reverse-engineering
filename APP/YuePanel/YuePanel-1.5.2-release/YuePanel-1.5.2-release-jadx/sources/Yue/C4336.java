package Yue;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4771
public final class C4336 implements InterfaceC4221 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C4336 f824 = new C4336();

    @Override // Yue.InterfaceC4221
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public EnumC4222 mo1185(@InterfaceC6399 Path path, @InterfaceC6399 Path path2, boolean z) {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "target");
        LinkOption[] linkOptionArrM2396 = C5716.f1632.m2396(z);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrM2396, linkOptionArrM2396.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(linkOptionArrM2396, linkOptionArrM2396.length);
            C5499.m17102(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(this, target, *options)");
        }
        return EnumC4222.f8576;
    }
}
