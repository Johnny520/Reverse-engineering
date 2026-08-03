.class public final Ls/m0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr/s;

.field public final b:Lb5/c;

.field public c:Lj8/f;

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Lr/s;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb5/c;

    .line 5
    .line 6
    const/16 v1, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lb5/c;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ls/m0;->b:Lb5/c;

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    iput v0, p0, Ls/m0;->d:I

    .line 15
    .line 16
    iput v0, p0, Ls/m0;->e:I

    .line 17
    .line 18
    iput-object p1, p0, Ls/m0;->a:Lr/s;

    .line 19
    .line 20
    return-void
.end method
