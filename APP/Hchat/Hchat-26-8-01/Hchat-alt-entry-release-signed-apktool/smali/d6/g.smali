.class public Ld6/g;
.super Ljava/io/Writer;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final j:Ljava/lang/String;


# instance fields
.field public final g:Ljava/io/Writer;

.field public h:I

.field public i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "line.separator"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ld6/g;->j:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ld6/g;->h:I

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Ld6/g;->i:Z

    .line 9
    .line 10
    iput-object p1, p0, Ld6/g;->g:Ljava/io/Writer;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Ld6/g;->h:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Ld6/g;->g:Ljava/io/Writer;

    .line 7
    .line 8
    const/16 v2, 0x20

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 11
    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void
.end method

.method public final append(C)Ljava/io/Writer;
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Ld6/g;->write(I)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 0

    .line 14
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ld6/g;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Ld6/g;->write(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final append(C)Ljava/lang/Appendable;
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Ld6/g;->write(I)V

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0

    .line 15
    invoke-virtual {p0, p1}, Ld6/g;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0

    .line 13
    invoke-virtual {p0, p1, p2, p3}, Ld6/g;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;

    return-object p0
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld6/g;->g:Ljava/io/Writer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld6/g;->g:Ljava/io/Writer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final write(I)V
    .locals 2

    const/16 v0, 0xa

    .line 77
    iget-object v1, p0, Ld6/g;->g:Ljava/io/Writer;

    if-ne p1, v0, :cond_0

    .line 78
    sget-object p1, Ld6/g;->j:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 79
    iput-boolean p1, p0, Ld6/g;->i:Z

    return-void

    .line 80
    :cond_0
    iget-boolean v0, p0, Ld6/g;->i:Z

    if-eqz v0, :cond_1

    .line 81
    invoke-virtual {p0}, Ld6/g;->a()V

    :cond_1
    const/4 v0, 0x0

    .line 82
    iput-boolean v0, p0, Ld6/g;->i:Z

    .line 83
    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 76
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Ld6/g;->write(Ljava/lang/String;II)V

    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 5

    .line 1
    add-int/2addr p3, p2

    .line 2
    move v0, p2

    .line 3
    :goto_0
    if-ge p2, p3, :cond_4

    .line 4
    .line 5
    const/16 p2, 0xa

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->indexOf(II)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const/4 v1, -0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    iget-object v3, p0, Ld6/g;->g:Ljava/io/Writer;

    .line 14
    .line 15
    if-eq p2, v1, :cond_2

    .line 16
    .line 17
    if-lt p2, p3, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    sub-int v1, p2, v0

    .line 21
    .line 22
    iget-boolean v4, p0, Ld6/g;->i:Z

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    if-lez v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Ld6/g;->a()V

    .line 29
    .line 30
    .line 31
    iput-boolean v2, p0, Ld6/g;->i:Z

    .line 32
    .line 33
    :cond_1
    invoke-virtual {v3, p1, v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Ld6/g;->j:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Ld6/g;->i:Z

    .line 43
    .line 44
    add-int/lit8 v0, p2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    sub-int/2addr p3, v0

    .line 48
    iget-boolean p2, p0, Ld6/g;->i:Z

    .line 49
    .line 50
    if-eqz p2, :cond_3

    .line 51
    .line 52
    if-lez p3, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0}, Ld6/g;->a()V

    .line 55
    .line 56
    .line 57
    iput-boolean v2, p0, Ld6/g;->i:Z

    .line 58
    .line 59
    :cond_3
    invoke-virtual {v3, p1, v0, p3}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    .line 60
    .line 61
    .line 62
    :cond_4
    return-void
.end method

.method public final write([C)V
    .locals 2

    const/4 v0, 0x0

    .line 63
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ld6/g;->write([CII)V

    return-void
.end method

.method public final write([CII)V
    .locals 5

    add-int/2addr p3, p2

    move v0, p2

    :goto_0
    const/4 v1, 0x0

    .line 64
    iget-object v2, p0, Ld6/g;->g:Ljava/io/Writer;

    if-ge p2, p3, :cond_2

    .line 65
    aget-char v3, p1, p2

    const/16 v4, 0xa

    if-ne v3, v4, :cond_1

    sub-int v3, p2, v0

    .line 66
    iget-boolean v4, p0, Ld6/g;->i:Z

    if-eqz v4, :cond_0

    if-lez v3, :cond_0

    .line 67
    invoke-virtual {p0}, Ld6/g;->a()V

    .line 68
    iput-boolean v1, p0, Ld6/g;->i:Z

    .line 69
    :cond_0
    invoke-virtual {v2, p1, v0, v3}, Ljava/io/Writer;->write([CII)V

    .line 70
    sget-object v0, Ld6/g;->j:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 71
    iput-boolean v0, p0, Ld6/g;->i:Z

    add-int/lit8 v0, p2, 0x1

    move p2, v0

    goto :goto_0

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    sub-int/2addr p2, v0

    .line 72
    iget-boolean p3, p0, Ld6/g;->i:Z

    if-eqz p3, :cond_3

    if-lez p2, :cond_3

    .line 73
    invoke-virtual {p0}, Ld6/g;->a()V

    .line 74
    iput-boolean v1, p0, Ld6/g;->i:Z

    .line 75
    :cond_3
    invoke-virtual {v2, p1, v0, p2}, Ljava/io/Writer;->write([CII)V

    return-void
.end method
