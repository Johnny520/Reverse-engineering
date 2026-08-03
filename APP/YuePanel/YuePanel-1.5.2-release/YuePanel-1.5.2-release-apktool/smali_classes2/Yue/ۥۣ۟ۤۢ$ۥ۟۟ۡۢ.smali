.class public final LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;
.super LYue/ۥ۟ۧۤۤ;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt"
    f = "Deprecated.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x88,
        0x8b
    }
    m = "single"
    n = {
        "$this$consume$iv",
        "iterator",
        "$this$consume$iv",
        "single"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۤۢ;->ۥ۟۟ۢۤ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e4;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Ljava/lang/Object;

.field public ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public synthetic ۥ۟۟۠ۥ:Ljava/lang/Object;

.field public ۥ۟۟۠ۦ:I


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e4\u06e2\u06e3$\u06e5\u06df\u06df\u06e1\u06e2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, LYue/ۥ۟ۧۤۤ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iget p1, p0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۦ:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۦ:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥۣ۟۟ۡ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
