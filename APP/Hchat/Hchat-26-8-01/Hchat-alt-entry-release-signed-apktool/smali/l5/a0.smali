.class public abstract Ll5/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lt5/d;


# instance fields
.field public final a:Lk5/u;

.field public final b:Lf5/f;

.field public final c:I


# direct methods
.method public constructor <init>(Lk5/u;Lf5/f;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll5/a0;->a:Lk5/u;

    .line 5
    .line 6
    iput-object p2, p0, Ll5/a0;->b:Lf5/f;

    .line 7
    .line 8
    iput p3, p0, Ll5/a0;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, Ll5/a0;->b:Lf5/f;

    .line 2
    .line 3
    iget v0, v0, Lf5/f;->m:I

    .line 4
    .line 5
    invoke-static {v0}, Leh/a;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    div-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    return v0
.end method

.method public final i()Lf5/f;
    .locals 1

    .line 1
    iget-object v0, p0, Ll5/a0;->b:Lf5/f;

    .line 2
    .line 3
    return-object v0
.end method
