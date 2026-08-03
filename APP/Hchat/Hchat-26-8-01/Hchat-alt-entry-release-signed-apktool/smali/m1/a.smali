.class public final Lm1/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Lf1/g;

.field public b:Lf1/b;

.field public c:J

.field public d:I

.field public final e:Lh1/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lm1/a;->c:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lm1/a;->d:I

    .line 10
    .line 11
    new-instance v0, Lh1/b;

    .line 12
    .line 13
    invoke-direct {v0}, Lh1/b;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lm1/a;->e:Lh1/b;

    .line 17
    .line 18
    return-void
.end method
