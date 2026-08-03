.class public final LYue/ۥ۟۟ۦۤ$ۥ۟۟۟۠;
.super LYue/ۥ۟۟ۦۤ$ۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۦۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟۟ۦۤ$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟()F
    .locals 2

    iget-object v0, p0, LYue/ۥ۟۟ۦۤ$ۥ;->ۥ:Landroid/os/Bundle;

    const-string v1, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    return v0
.end method
