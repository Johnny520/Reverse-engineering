.class public final La/F9$d;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/F9;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:La/F9;


# direct methods
.method public constructor <init>(La/F9;)V
    .locals 0

    iput-object p1, p0, La/F9$d;->a:La/F9;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    iget-object v0, p0, La/F9$d;->a:La/F9;

    iget-object v1, v0, La/F9;->z:La/g1;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, La/F9;->f()V

    :cond_0
    return-void
.end method

.method public final onInvalidated()V
    .locals 1

    iget-object v0, p0, La/F9$d;->a:La/F9;

    invoke-virtual {v0}, La/F9;->dismiss()V

    return-void
.end method
