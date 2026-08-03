.class public final Lr7/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lr7/m;


# instance fields
.field public final g:Lr7/u;

.field public h:I


# direct methods
.method public constructor <init>(Lr7/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr7/t;->g:Lr7/u;

    .line 5
    .line 6
    iget p1, p1, Lk7/a;->g:I

    .line 7
    .line 8
    iput p1, p0, Lr7/t;->h:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Class;)Lk7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/t;->g:Lr7/u;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return-object p1
.end method

.method public final get()I
    .locals 1

    .line 1
    iget v0, p0, Lr7/t;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final k(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr7/t;->h:I

    .line 2
    .line 3
    return-void
.end method
