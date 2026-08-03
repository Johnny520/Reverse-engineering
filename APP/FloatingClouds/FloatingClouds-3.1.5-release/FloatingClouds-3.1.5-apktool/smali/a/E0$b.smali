.class public final La/E0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ac;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/E0;->initDelegate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/E0;


# direct methods
.method public constructor <init>(La/E0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/E0$b;->a:La/E0;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/activity/ComponentActivity;)V
    .locals 2

    iget-object p1, p0, La/E0$b;->a:La/E0;

    invoke-virtual {p1}, La/E0;->getDelegate()La/O0;

    move-result-object v0

    invoke-virtual {v0}, La/O0;->k()V

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object p1

    const-string v1, "androidx:appcompat"

    invoke-virtual {p1, v1}, Landroidx/savedstate/a;->a(Ljava/lang/String;)Landroid/os/Bundle;

    invoke-virtual {v0}, La/O0;->o()V

    return-void
.end method
