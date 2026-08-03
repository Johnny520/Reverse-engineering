.class final Lg/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/h;


# instance fields
.field final synthetic a:Lg/k;


# direct methods
.method constructor <init>(Lg/k;)V
    .locals 0

    iput-object p1, p0, Lg/f;->a:Lg/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk/a;)I
    .locals 1

    iget-object v0, p0, Lg/f;->a:Lg/k;

    invoke-virtual {v0, p1}, Lg/k;->b(Lk/a;)Lg/r;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-virtual {p1}, Lg/r;->e()I

    move-result p1

    return p1
.end method
