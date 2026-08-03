.class public final Lh0/e1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lh0/l;


# instance fields
.field public final synthetic a:Lh0/d1;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lh0/d1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh0/e1;->a:Lh0/d1;

    .line 5
    .line 6
    iput-boolean p2, p0, Lh0/e1;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/e1;->a:Lh0/d1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lh0/e1;->b:Z

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lh0/d1;->l(Z)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method
