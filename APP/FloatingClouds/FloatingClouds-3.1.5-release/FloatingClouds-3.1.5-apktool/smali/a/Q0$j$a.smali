.class public final La/Q0$j$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/Q0$j;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/Q0$j;


# direct methods
.method public constructor <init>(La/Q0$j;)V
    .locals 0

    iput-object p1, p0, La/Q0$j$a;->a:La/Q0$j;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, La/Q0$j$a;->a:La/Q0$j;

    invoke-virtual {p1}, La/Q0$j;->d()V

    return-void
.end method
