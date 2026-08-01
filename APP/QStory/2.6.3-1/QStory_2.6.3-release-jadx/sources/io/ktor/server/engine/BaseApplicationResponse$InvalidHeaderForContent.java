package io.ktor.server.engine;

import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC6266;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\r"}, m151d2 = {"io/ktor/server/engine/BaseApplicationResponse$InvalidHeaderForContent", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "Lio/ktor/server/engine/BaseApplicationResponse$InvalidHeaderForContent;", "", "name", "content", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "createCopy", "()Lio/ktor/server/engine/BaseApplicationResponse$InvalidHeaderForContent;", "Ljava/lang/String;", "ktor-server-core"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class BaseApplicationResponse$InvalidHeaderForContent extends IllegalStateException implements InterfaceC6266 {
    private final String content;
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplicationResponse$InvalidHeaderForContent(String str, String str2) {
        super("Header " + str + " is not allowed for " + str2);
        str.getClass();
        str2.getClass();
        this.name = str;
        this.content = str2;
    }

    @Override // kotlinx.coroutines.InterfaceC6266
    public BaseApplicationResponse$InvalidHeaderForContent createCopy() {
        BaseApplicationResponse$InvalidHeaderForContent baseApplicationResponse$InvalidHeaderForContent = new BaseApplicationResponse$InvalidHeaderForContent(this.name, this.content);
        baseApplicationResponse$InvalidHeaderForContent.initCause(this);
        return baseApplicationResponse$InvalidHeaderForContent;
    }
}
