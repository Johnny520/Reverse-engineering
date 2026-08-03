.class public final La/j5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/j5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/j5;


# direct methods
.method public constructor <init>(La/j5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/j5$a;->a:La/j5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La/j5$a;->a:La/j5;

    iget-object v1, v0, La/j5;->Y:La/j5$c;

    iget-object v0, v0, La/j5;->g0:Landroid/app/Dialog;

    invoke-virtual {v1, v0}, La/j5$c;->onDismiss(Landroid/content/DialogInterface;)V

    return-void
.end method
