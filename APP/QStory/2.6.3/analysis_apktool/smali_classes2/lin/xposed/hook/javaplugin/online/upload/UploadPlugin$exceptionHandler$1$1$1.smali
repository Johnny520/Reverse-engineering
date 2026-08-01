.class final Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1$1;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Lcom/kongzue/dialogx/interfaces/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/kongzue/dialogx/interfaces/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# static fields
.field public static final INSTANCE:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1$1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1$1<",
            "TD;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1$1;

    .line 2
    .line 3
    invoke-direct {v0}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1$1;->INSTANCE:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic onClick(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;Landroid/view/View;)Z
    .locals 0

    .line 1
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1$1;->onClick(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final onClick(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 0

    .line 8
    const/4 p0, 0x0

    return p0
.end method
