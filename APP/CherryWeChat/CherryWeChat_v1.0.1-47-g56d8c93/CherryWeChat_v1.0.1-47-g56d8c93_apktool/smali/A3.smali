.class public final LA3;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field public final synthetic a:LB3;


# direct methods
.method public constructor <init>(LB3;)V
    .locals 0

    iput-object p1, p0, LA3;->a:LB3;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, LA3;->a:LB3;

    invoke-virtual {p1}, LB3;->m()V

    return-void
.end method
