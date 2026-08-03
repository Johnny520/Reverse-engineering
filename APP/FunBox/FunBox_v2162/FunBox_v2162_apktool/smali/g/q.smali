.class public abstract Lg/q;
.super Lg/r;
.source "SourceFile"


# instance fields
.field private final b:Lk/u;


# direct methods
.method public constructor <init>(Lk/u;)V
    .locals 1

    invoke-direct {p0}, Lg/r;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lg/q;->b:Lk/u;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "type == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(Lg/k;)V
    .locals 1

    invoke-virtual {p1}, Lg/k;->q()Lg/x;

    move-result-object p1

    iget-object v0, p0, Lg/q;->b:Lk/u;

    invoke-virtual {p1, v0}, Lg/x;->v(Lk/u;)V

    return-void
.end method

.method public final i()Lk/u;
    .locals 1

    iget-object v0, p0, Lg/q;->b:Lk/u;

    return-object v0
.end method
