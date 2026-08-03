.class public final Ll5/d0;
.super Lk5/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:Ll5/e0;


# direct methods
.method public constructor <init>(Ll5/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll5/d0;->g:Ll5/e0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ll5/b0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, Ll5/b0;-><init>(Lk5/t;II)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Ll5/d0;->g:Ll5/e0;

    .line 2
    .line 3
    iget v0, v0, Ll5/e0;->d:I

    .line 4
    .line 5
    return v0
.end method
