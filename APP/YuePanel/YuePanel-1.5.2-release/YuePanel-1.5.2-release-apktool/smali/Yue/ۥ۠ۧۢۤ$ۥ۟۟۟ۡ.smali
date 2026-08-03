.class public LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۡ;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۢۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e1"
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥ۠ۧۢۤ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۧۢۤ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۡ;->ۥ:LYue/ۥ۠ۧۢۤ;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۡ;->ۥ:LYue/ۥ۠ۧۢۤ;

    invoke-virtual {v0}, LYue/ۥ۠ۧۢۤ;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۡ;->ۥ:LYue/ۥ۠ۧۢۤ;

    invoke-virtual {v0}, LYue/ۥ۠ۧۢۤ;->show()V

    :cond_0
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۡ;->ۥ:LYue/ۥ۠ۧۢۤ;

    invoke-virtual {v0}, LYue/ۥ۠ۧۢۤ;->dismiss()V

    return-void
.end method
