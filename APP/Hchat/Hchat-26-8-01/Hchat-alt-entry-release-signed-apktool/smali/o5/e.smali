.class public abstract Lo5/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lo5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lo5/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lo5/e;->a:Lo5/a;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lk5/u;I)Ljava/util/Set;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->N(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-instance v1, Lo5/b;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1, v0}, Lo5/b;-><init>(Lk5/u;II)V

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 16
    .line 17
    return-object p0
.end method


# virtual methods
.method public abstract b()Ljava/util/Set;
.end method

.method public abstract c()Lo5/c;
.end method

.method public abstract d()Lo5/c;
.end method

.method public abstract e()Lo5/c;
.end method
