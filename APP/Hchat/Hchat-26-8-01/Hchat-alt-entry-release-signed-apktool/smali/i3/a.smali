.class public abstract Li3/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static a(Ljava/nio/ByteBuffer;Lqf/a;)[B
    .locals 5

    .line 1
    iget v0, p1, Lqf/a;->e:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-wide v0, p1, Lqf/a;->f:J

    .line 14
    .line 15
    long-to-int v0, v0

    .line 16
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    iget-wide v0, p1, Lqf/a;->g:J

    .line 23
    .line 24
    const-wide/32 v2, 0x7fffffff

    .line 25
    .line 26
    .line 27
    cmp-long v2, v0, v2

    .line 28
    .line 29
    if-gtz v2, :cond_1

    .line 30
    .line 31
    long-to-int v0, v0

    .line 32
    new-array v1, v0, [B

    .line 33
    .line 34
    new-instance v2, Ljava/util/zip/Inflater;

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {v2, v3}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, p0}, Ljava/util/zip/Inflater;->setInput(Ljava/nio/ByteBuffer;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ljava/util/zip/Inflater;->inflate([B)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-virtual {v2}, Ljava/util/zip/Inflater;->end()V

    .line 48
    .line 49
    .line 50
    if-ne p0, v0, :cond_0

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_0
    new-instance v1, Ljava/util/zip/DataFormatException;

    .line 54
    .line 55
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v2, ", got: "

    .line 60
    .line 61
    const-string v3, ", expected: "

    .line 62
    .line 63
    const-string v4, "Unexpected size of decompressed entry: "

    .line 64
    .line 65
    invoke-static {p0, v4, p1, v2, v3}, Leh/a;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-direct {v1, p0}, Ljava/util/zip/DataFormatException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :cond_1
    new-instance p0, Ljava/util/zip/DataFormatException;

    .line 81
    .line 82
    const-string p1, "Entry too large: "

    .line 83
    .line 84
    invoke-static {v0, v1, p1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-direct {p0, p1}, Ljava/util/zip/DataFormatException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p0
.end method

.method public static b(Landroid/view/inputmethod/EditorInfo;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/inputmethod/EditorInfo;->setStylusHandwritingEnabled(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
