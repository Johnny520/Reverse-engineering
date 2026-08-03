.class final Lorg/luckypray/dexkit/result/ClassData$toString$1$2;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lorg/luckypray/dexkit/result/ClassData;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/result/ClassData;->toString()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Lorg/luckypray/dexkit/result/ClassData;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/result/ClassData$toString$1$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/luckypray/dexkit/result/ClassData$toString$1$2;

    invoke-direct {v0}, Lorg/luckypray/dexkit/result/ClassData$toString$1$2;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/result/ClassData$toString$1$2;->INSTANCE:Lorg/luckypray/dexkit/result/ClassData$toString$1$2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lorg/luckypray/dexkit/result/ClassData;)Ljava/lang/CharSequence;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/result/ClassData;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/ClassData$toString$1$2;->invoke(Lorg/luckypray/dexkit/result/ClassData;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
