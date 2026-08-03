.class public LYue/ۥۢۡ۠ۡ$ۥ۟۟۟۠;
.super LYue/ۥۢۡ۠ۡ$ۥ۟۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡ۠ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# static fields
.field public static final ۥ۟:LYue/ۥۢۡ۠ۡ$ۥ۟۟۟۠;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۢۡ۠ۡ$ۥ۟۟۟۠;

    invoke-direct {v0}, LYue/ۥۢۡ۠ۡ$ۥ۟۟۟۠;-><init>()V

    sput-object v0, LYue/ۥۢۡ۠ۡ$ۥ۟۟۟۠;->ۥ۟:LYue/ۥۢۡ۠ۡ$ۥ۟۟۟۠;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYue/ۥۢۡ۠ۡ$ۥ۟۟۟;-><init>(LYue/ۥۢۡ۠ۡ$ۥ۟۟;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟()Z
    .locals 2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۢۡۡ;->ۥ(Ljava/util/Locale;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
