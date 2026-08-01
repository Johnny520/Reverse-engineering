.class public final Lk8;
.super Ljava/lang/Object;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Lay;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lay;-><init>(I)V

    iput-object p1, p0, Lk8;->a:Ljava/lang/Object;

    .line 3
    new-instance p1, Lb40;

    invoke-direct {p1}, Lb40;-><init>()V

    iput-object p1, p0, Lk8;->b:Ljava/lang/Object;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lk8;->c:Ljava/lang/Object;

    .line 5
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lk8;->d:Ljava/lang/Object;

    return-void

    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance p1, Ln6;

    .line 8
    invoke-direct {p1}, Lb40;-><init>()V

    .line 9
    iput-object p1, p0, Lk8;->a:Ljava/lang/Object;

    .line 10
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lk8;->b:Ljava/lang/Object;

    .line 11
    new-instance p1, Lfs;

    invoke-direct {p1}, Lfs;-><init>()V

    iput-object p1, p0, Lk8;->c:Ljava/lang/Object;

    .line 12
    new-instance p1, Ln6;

    .line 13
    invoke-direct {p1}, Lb40;-><init>()V

    .line 14
    iput-object p1, p0, Lk8;->d:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/graphics/Typeface;Ldw;)V
    .locals 7

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lk8;->d:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, Lk8;->a:Ljava/lang/Object;

    .line 18
    new-instance p1, Lew;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Lew;-><init>(I)V

    iput-object p1, p0, Lk8;->c:Ljava/lang/Object;

    const/4 p1, 0x6

    .line 19
    invoke-virtual {p2, p1}, Lz50;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 20
    iget v2, p2, Lz50;->a:I

    add-int/2addr v0, v2

    .line 21
    iget-object v2, p2, Lz50;->d:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 22
    iget-object v0, p2, Lz50;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 23
    new-array v0, v0, [C

    iput-object v0, p0, Lk8;->b:Ljava/lang/Object;

    .line 24
    invoke-virtual {p2, p1}, Lz50;->a(I)I

    move-result p1

    if-eqz p1, :cond_1

    .line 25
    iget v0, p2, Lz50;->a:I

    add-int/2addr p1, v0

    .line 26
    iget-object v0, p2, Lz50;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    .line 27
    iget-object p1, p2, Lz50;->d:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    move p2, v1

    :goto_2
    if-ge p2, p1, :cond_6

    .line 28
    new-instance v0, Lpi;

    invoke-direct {v0, p0, p2}, Lpi;-><init>(Lk8;I)V

    .line 29
    invoke-virtual {v0}, Lpi;->b()Lcw;

    move-result-object v2

    const/4 v3, 0x4

    .line 30
    invoke-virtual {v2, v3}, Lz50;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, Lz50;->d:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v2, v2, Lz50;->a:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    move v2, v1

    .line 31
    :goto_3
    iget-object v3, p0, Lk8;->b:Ljava/lang/Object;

    check-cast v3, [C

    mul-int/lit8 v4, p2, 0x2

    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    .line 32
    invoke-virtual {v0}, Lpi;->b()Lcw;

    move-result-object v2

    const/16 v3, 0x10

    .line 33
    invoke-virtual {v2, v3}, Lz50;->a(I)I

    move-result v4

    if-eqz v4, :cond_3

    .line 34
    iget v5, v2, Lz50;->a:I

    add-int/2addr v4, v5

    .line 35
    iget-object v5, v2, Lz50;->d:Ljava/lang/Object;

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    add-int/2addr v5, v4

    .line 36
    iget-object v2, v2, Lz50;->d:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_4

    :cond_3
    move v2, v1

    :goto_4
    const/4 v4, 0x1

    if-lez v2, :cond_4

    move v2, v4

    goto :goto_5

    :cond_4
    move v2, v1

    .line 37
    :goto_5
    const-string v5, "invalid metadata codepoint length"

    invoke-static {v5, v2}, Lmu;->b(Ljava/lang/String;Z)V

    .line 38
    iget-object v2, p0, Lk8;->c:Ljava/lang/Object;

    check-cast v2, Lew;

    .line 39
    invoke-virtual {v0}, Lpi;->b()Lcw;

    move-result-object v5

    .line 40
    invoke-virtual {v5, v3}, Lz50;->a(I)I

    move-result v3

    if-eqz v3, :cond_5

    .line 41
    iget v6, v5, Lz50;->a:I

    add-int/2addr v3, v6

    .line 42
    iget-object v6, v5, Lz50;->d:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v6

    add-int/2addr v6, v3

    .line 43
    iget-object v3, v5, Lz50;->d:Ljava/lang/Object;

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    goto :goto_6

    :cond_5
    move v3, v1

    :goto_6
    sub-int/2addr v3, v4

    .line 44
    invoke-virtual {v2, v0, v1, v3}, Lew;->a(Lpi;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 4

    .line 1
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lk8;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lb40;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, p1, v1}, Lb40;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x0

    .line 35
    :goto_0
    if-ge v2, v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {p0, v3, p2, p3}, Lk8;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 55
    .line 56
    const-string p2, "This graph contains cyclic dependencies"

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public b(Ln1;)Lo50;
    .locals 5

    .line 1
    iget-object v0, p0, Lk8;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lo50;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v4, v3, Lo50;->b:Ln1;

    .line 21
    .line 22
    if-ne v4, p1, :cond_0

    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    new-instance v1, Lo50;

    .line 29
    .line 30
    iget-object v2, p0, Lk8;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Landroid/content/Context;

    .line 33
    .line 34
    invoke-direct {v1, v2, p1}, Lo50;-><init>(Landroid/content/Context;Ln1;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-object v1
.end method

.method public c(Ln1;Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lk8;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lk8;->b(Ln1;)Lo50;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v1, Lav;

    .line 10
    .line 11
    iget-object v2, p0, Lk8;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Landroid/content/Context;

    .line 14
    .line 15
    check-cast p2, Ls50;

    .line 16
    .line 17
    invoke-direct {v1, v2, p2}, Lav;-><init>(Landroid/content/Context;Ls50;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, p1, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method public d(Ln1;Landroid/view/Menu;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lk8;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lk8;->b(Ln1;)Lo50;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Lk8;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lb40;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1, p2, v2}, Lb40;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Landroid/view/Menu;

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    new-instance v2, Lov;

    .line 23
    .line 24
    iget-object v3, p0, Lk8;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Landroid/content/Context;

    .line 27
    .line 28
    move-object v4, p2

    .line 29
    check-cast v4, Lqu;

    .line 30
    .line 31
    invoke-direct {v2, v3, v4}, Lov;-><init>(Landroid/content/Context;Lqu;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p2, v2}, Lb40;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-interface {v0, p1, v2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method
