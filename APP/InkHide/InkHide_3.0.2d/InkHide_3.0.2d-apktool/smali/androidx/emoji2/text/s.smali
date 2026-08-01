.class public final Landroidx/emoji2/text/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Landroidx/emoji2/text/s;->b:Ljava/lang/Object;

    .line 32
    iput-object p2, p0, Landroidx/emoji2/text/s;->a:Ljava/lang/Object;

    .line 33
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/s;->c:Ljava/lang/Object;

    .line 34
    new-instance p1, Ll/k;

    invoke-direct {p1}, Ll/k;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/s;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;LG/b;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/emoji2/text/s;->d:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Landroidx/emoji2/text/s;->a:Ljava/lang/Object;

    .line 4
    new-instance p1, Landroidx/emoji2/text/r;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Landroidx/emoji2/text/r;-><init>(I)V

    iput-object p1, p0, Landroidx/emoji2/text/s;->c:Ljava/lang/Object;

    const/4 p1, 0x6

    .line 5
    invoke-virtual {p2, p1}, LG/c;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 6
    iget v2, p2, LG/c;->a:I

    add-int/2addr v0, v2

    .line 7
    iget-object v2, p2, LG/c;->d:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 8
    iget-object v0, p2, LG/c;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 9
    new-array v0, v0, [C

    iput-object v0, p0, Landroidx/emoji2/text/s;->b:Ljava/lang/Object;

    .line 10
    invoke-virtual {p2, p1}, LG/c;->a(I)I

    move-result p1

    if-eqz p1, :cond_1

    .line 11
    iget v0, p2, LG/c;->a:I

    add-int/2addr p1, v0

    .line 12
    iget-object v0, p2, LG/c;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    .line 13
    iget-object p1, p2, LG/c;->d:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    move p2, v1

    :goto_2
    if-ge p2, p1, :cond_7

    .line 14
    new-instance v0, Landroidx/emoji2/text/n;

    invoke-direct {v0, p0, p2}, Landroidx/emoji2/text/n;-><init>(Landroidx/emoji2/text/s;I)V

    .line 15
    invoke-virtual {v0}, Landroidx/emoji2/text/n;->b()LG/a;

    move-result-object v2

    const/4 v3, 0x4

    .line 16
    invoke-virtual {v2, v3}, LG/c;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, LG/c;->d:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v2, v2, LG/c;->a:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    move v2, v1

    :goto_3
    mul-int/lit8 v3, p2, 0x2

    .line 17
    iget-object v4, p0, Landroidx/emoji2/text/s;->b:Ljava/lang/Object;

    check-cast v4, [C

    invoke-static {v2, v4, v3}, Ljava/lang/Character;->toChars(I[CI)I

    .line 18
    invoke-virtual {v0}, Landroidx/emoji2/text/n;->b()LG/a;

    move-result-object v2

    const/16 v3, 0x10

    .line 19
    invoke-virtual {v2, v3}, LG/c;->a(I)I

    move-result v4

    if-eqz v4, :cond_3

    .line 20
    iget v5, v2, LG/c;->a:I

    add-int/2addr v4, v5

    .line 21
    iget-object v5, v2, LG/c;->d:Ljava/lang/Object;

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    add-int/2addr v5, v4

    .line 22
    iget-object v2, v2, LG/c;->d:Ljava/lang/Object;

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

    :goto_5
    if-eqz v2, :cond_6

    .line 23
    invoke-virtual {v0}, Landroidx/emoji2/text/n;->b()LG/a;

    move-result-object v2

    .line 24
    invoke-virtual {v2, v3}, LG/c;->a(I)I

    move-result v3

    if-eqz v3, :cond_5

    .line 25
    iget v5, v2, LG/c;->a:I

    add-int/2addr v3, v5

    .line 26
    iget-object v5, v2, LG/c;->d:Ljava/lang/Object;

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    add-int/2addr v5, v3

    .line 27
    iget-object v2, v2, LG/c;->d:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_6

    :cond_5
    move v2, v1

    :goto_6
    sub-int/2addr v2, v4

    .line 28
    iget-object v3, p0, Landroidx/emoji2/text/s;->c:Ljava/lang/Object;

    check-cast v3, Landroidx/emoji2/text/r;

    invoke-virtual {v3, v0, v1, v2}, Landroidx/emoji2/text/r;->a(Landroidx/emoji2/text/n;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    .line 29
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid metadata codepoint length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    return-void
.end method


# virtual methods
.method public a(Lg/a;)Lg/f;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/s;->c:Ljava/lang/Object;

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
    check-cast v3, Lg/f;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v4, v3, Lg/f;->b:Lg/a;

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
    new-instance v1, Lg/f;

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/emoji2/text/s;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Landroid/content/Context;

    .line 33
    .line 34
    invoke-direct {v1, v2, p1}, Lg/f;-><init>(Landroid/content/Context;Lg/a;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-object v1
.end method

.method public b(Lg/a;Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/emoji2/text/s;->a(Lg/a;)Lg/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lh/t;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/emoji2/text/s;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/content/Context;

    .line 10
    .line 11
    check-cast p2, Lt/a;

    .line 12
    .line 13
    invoke-direct {v0, v1, p2}, Lh/t;-><init>(Landroid/content/Context;Lt/a;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Landroidx/emoji2/text/s;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Landroid/view/ActionMode$Callback;

    .line 19
    .line 20
    invoke-interface {p2, p1, v0}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method public c(Lg/a;Lh/m;)Z
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Landroidx/emoji2/text/s;->a(Lg/a;)Lg/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Landroidx/emoji2/text/s;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ll/k;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, p2, v1}, Ll/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Landroid/view/Menu;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    new-instance v1, Lh/C;

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/emoji2/text/s;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Landroid/content/Context;

    .line 23
    .line 24
    invoke-direct {v1, v2, p2}, Lh/C;-><init>(Landroid/content/Context;Lh/m;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p2, v1}, Ll/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p2, p0, Landroidx/emoji2/text/s;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p2, Landroid/view/ActionMode$Callback;

    .line 33
    .line 34
    invoke-interface {p2, p1, v1}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1
.end method
