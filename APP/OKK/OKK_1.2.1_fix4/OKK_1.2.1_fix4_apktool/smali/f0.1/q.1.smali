.class public final synthetic Lf0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:LP0/a;


# direct methods
.method public synthetic constructor <init>(LP0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/q;->a:LP0/a;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    const-string p1, "$onDismissRefresh"

    iget-object v0, p0, Lf0/q;->a:LP0/a;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, LP0/a;->invoke()Ljava/lang/Object;

    return-void
.end method
