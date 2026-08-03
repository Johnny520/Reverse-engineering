.class public final Ltf/e;
.super Ltf/f;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final g:Ltf/f;

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(Ltf/f;II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltf/e;->g:Ltf/f;

    .line 5
    .line 6
    iput p2, p0, Ltf/e;->h:I

    .line 7
    .line 8
    sget-object v0, Ltf/f;->Companion:Ltf/c;

    .line 9
    .line 10
    invoke-virtual {p1}, Ltf/a;->size()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p2, p3, p1}, Ltf/c;->c(III)V

    .line 18
    .line 19
    .line 20
    sub-int/2addr p3, p2

    .line 21
    iput p3, p0, Ltf/e;->i:I

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Ltf/f;->Companion:Ltf/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ltf/e;->i:I

    .line 7
    .line 8
    invoke-static {p1, v0}, Ltf/c;->a(II)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Ltf/e;->h:I

    .line 12
    .line 13
    add-int/2addr v0, p1

    .line 14
    iget-object p1, p0, Ltf/e;->g:Ltf/f;

    .line 15
    .line 16
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final getSize()I
    .locals 1

    .line 1
    iget v0, p0, Ltf/e;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 2

    .line 1
    sget-object v0, Ltf/f;->Companion:Ltf/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ltf/e;->i:I

    .line 7
    .line 8
    invoke-static {p1, p2, v0}, Ltf/c;->c(III)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ltf/e;

    .line 12
    .line 13
    iget v1, p0, Ltf/e;->h:I

    .line 14
    .line 15
    add-int/2addr p1, v1

    .line 16
    add-int/2addr v1, p2

    .line 17
    iget-object p2, p0, Ltf/e;->g:Ltf/f;

    .line 18
    .line 19
    invoke-direct {v0, p2, p1, v1}, Ltf/e;-><init>(Ltf/f;II)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
