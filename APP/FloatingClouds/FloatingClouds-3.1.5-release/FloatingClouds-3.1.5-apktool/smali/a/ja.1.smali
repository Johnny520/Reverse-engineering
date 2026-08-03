.class public final synthetic La/ja;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:La/ra;


# direct methods
.method public synthetic constructor <init>(La/ra;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ja;->a:La/ra;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object p1, p0, La/ja;->a:La/ra;

    iget-object v0, p1, La/ra;->j:La/j2;

    if-eqz v0, :cond_0

    sget-object v1, La/ca;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p1, La/ra;->j:La/j2;

    iput-object v0, p1, La/ra;->h:Landroid/widget/Switch;

    return-void
.end method
