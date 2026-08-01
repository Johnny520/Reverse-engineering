.class public final synthetic Lt0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lt0/c;


# direct methods
.method public synthetic constructor <init>(Lt0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/b;->a:Lt0/c;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/b;->a:Lt0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt0/c;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lt0/c;->a()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
