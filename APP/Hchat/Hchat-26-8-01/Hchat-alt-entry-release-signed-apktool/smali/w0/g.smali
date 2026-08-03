.class public final Lw0/g;
.super Lw0/q;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:Lw0/b;


# direct methods
.method public constructor <init>(Lw0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw0/g;->b:Lw0/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw0/g;->b:Lw0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw0/b;->c()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Laf/e;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 9
    .line 10
    .line 11
    throw v0
.end method
