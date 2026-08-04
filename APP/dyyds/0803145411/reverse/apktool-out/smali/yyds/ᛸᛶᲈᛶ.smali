.class public final Lyyds/ᛸᛶᲈᛶ;
.super Ljava/io/Writer;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᲀᛲᛳᲀ:Ljava/lang/StringBuilder;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛴᛷᛳᲈ;


# direct methods
.method public constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛴᛷᛳᲈ;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛸᛶᲈᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛷᛳᲈ;

    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᛸᛶᲈᛶ;->ᲀᛲᛳᲀ:Ljava/lang/StringBuilder;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛸᛶᲈᛶ;->ᲀᛲᛳᲀ:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 1

    .line 8
    iget-object v0, p0, Lyyds/ᛸᛶᲈᛶ;->ᲀᛲᛳᲀ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 1

    .line 7
    iget-object v0, p0, Lyyds/ᛸᛶᲈᛶ;->ᲀᛲᛳᲀ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 1

    .line 9
    iget-object v0, p0, Lyyds/ᛸᛶᲈᛶ;->ᲀᛲᛳᲀ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    return-object p0
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛶᲈᛶ;->ᲀᛲᛳᲀ:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/io/Closeable;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/io/Closeable;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛶᲈᛶ;->ᲀᛲᛳᲀ:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/io/Flushable;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/io/Flushable;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/io/Flushable;->flush()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final write(I)V
    .locals 0

    .line 16
    iget-object p0, p0, Lyyds/ᛸᛶᲈᛶ;->ᲀᛲᛳᲀ:Ljava/lang/StringBuilder;

    int-to-char p1, p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 0

    .line 15
    iget-object p0, p0, Lyyds/ᛸᛶᲈᛶ;->ᲀᛲᛳᲀ:Ljava/lang/StringBuilder;

    add-int/2addr p3, p2

    invoke-virtual {p0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    return-void
.end method

.method public final write([CII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛸᛶᲈᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛷᛳᲈ;

    .line 2
    .line 3
    iput-object p1, v0, Lyyds/ᛴᛷᛳᲈ;->ᲀᛲᛳᲀ:[C

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, v0, Lyyds/ᛴᛷᛳᲈ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛸᛶᲈᛶ;->ᲀᛲᛳᲀ:Ljava/lang/StringBuilder;

    .line 9
    .line 10
    add-int/2addr p3, p2

    .line 11
    invoke-virtual {p0, v0, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    .line 12
    .line 13
    .line 14
    return-void
.end method
