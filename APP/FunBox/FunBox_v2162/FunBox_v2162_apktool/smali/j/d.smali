.class public abstract Lj/d;
.super Lj/g;
.source "SourceFile"


# instance fields
.field private final e:Lk/a;


# direct methods
.method public constructor <init>(Lj/q;Lj/s;Lj/m;Lj/o;Lk/v;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lj/g;-><init>(Lj/q;Lj/s;Lj/m;Lj/o;)V

    if-eqz p5, :cond_0

    iput-object p5, p0, Lj/d;->e:Lk/a;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "cst == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj/d;->e:Lk/a;

    invoke-interface {v0}, Ln/k;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lk/a;
    .locals 1

    iget-object v0, p0, Lj/d;->e:Lk/a;

    return-object v0
.end method
