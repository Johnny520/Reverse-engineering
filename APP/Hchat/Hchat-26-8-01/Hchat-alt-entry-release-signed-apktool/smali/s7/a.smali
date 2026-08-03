.class public final synthetic Ls7/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lz7/t;


# instance fields
.field public final synthetic g:Ls7/b;


# direct methods
.method public synthetic constructor <init>(Ls7/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls7/a;->g:Ls7/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 6

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Ls7/a;->g:Ls7/b;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lo7/b;->Q(I)Lk7/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p2}, Lo7/b;->Q(I)Lk7/a;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    if-eq p1, p2, :cond_3

    .line 15
    .line 16
    if-eqz p1, :cond_3

    .line 17
    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget v1, p1, Lk7/a;->g:I

    .line 22
    .line 23
    iget v2, p2, Lk7/a;->g:I

    .line 24
    .line 25
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 26
    .line 27
    if-ne v1, v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    iget-object v3, v0, Lz7/c;->g:[Ljava/lang/Object;

    .line 34
    .line 35
    aget-object v4, v3, v1

    .line 36
    .line 37
    aget-object v5, v3, v2

    .line 38
    .line 39
    aput-object v5, v3, v1

    .line 40
    .line 41
    aput-object v4, v3, v2

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    iput v3, v0, Lz7/c;->k:I

    .line 45
    .line 46
    :goto_0
    invoke-virtual {p1, v2}, Lk7/a;->H(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v1}, Lk7/a;->H(I)V

    .line 50
    .line 51
    .line 52
    :cond_3
    :goto_1
    return-void
.end method
