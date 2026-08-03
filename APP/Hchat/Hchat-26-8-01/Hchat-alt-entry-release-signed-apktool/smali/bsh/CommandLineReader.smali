.class public Lbsh/CommandLineReader;
.super Ljava/io/FilterReader;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final lastCharNL:I = 0x1

.field static final normal:I = 0x0

.field static final sentSemi:I = 0x2


# instance fields
.field state:I


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterReader;-><init>(Ljava/io/Reader;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput p1, p0, Lbsh/CommandLineReader;->state:I

    .line 6
    .line 7
    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance p0, Lbsh/CommandLineReader;

    .line 2
    .line 3
    new-instance v0, Lbsh/FileReader;

    .line 4
    .line 5
    sget-object v1, Ljava/lang/System;->in:Ljava/io/InputStream;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lbsh/FileReader;-><init>(Ljava/io/InputStream;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lbsh/CommandLineReader;-><init>(Ljava/io/Reader;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 14
    .line 15
    invoke-virtual {p0}, Lbsh/CommandLineReader;->read()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0
.end method


# virtual methods
.method public read()I
    .locals 5

    .line 1
    iget v0, p0, Lbsh/CommandLineReader;->state:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    if-ne v0, v3, :cond_0

    .line 8
    .line 9
    iput v2, p0, Lbsh/CommandLineReader;->state:I

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    :goto_0
    iget-object v0, p0, Ljava/io/FilterReader;->in:Ljava/io/Reader;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/Reader;->read()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v4, 0xd

    .line 19
    .line 20
    if-ne v0, v4, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    if-ne v0, v1, :cond_3

    .line 24
    .line 25
    iget v1, p0, Lbsh/CommandLineReader;->state:I

    .line 26
    .line 27
    if-ne v1, v2, :cond_2

    .line 28
    .line 29
    iput v3, p0, Lbsh/CommandLineReader;->state:I

    .line 30
    .line 31
    const/16 v0, 0x3b

    .line 32
    .line 33
    return v0

    .line 34
    :cond_2
    iput v2, p0, Lbsh/CommandLineReader;->state:I

    .line 35
    .line 36
    return v0

    .line 37
    :cond_3
    const/4 v1, 0x0

    .line 38
    iput v1, p0, Lbsh/CommandLineReader;->state:I

    .line 39
    .line 40
    return v0
.end method

.method public read([CII)I
    .locals 1

    .line 41
    invoke-virtual {p0}, Lbsh/CommandLineReader;->read()I

    move-result p3

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    return v0

    :cond_0
    int-to-char p3, p3

    .line 42
    aput-char p3, p1, p2

    const/4 p1, 0x1

    return p1
.end method
