.class public LYue/ۥ۟ۨۢ;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field public ۥۣ۟۟۠:Ljava/lang/String;

.field public ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 2
    const-string v0, ""

    iput-object v0, p0, LYue/ۥ۟ۨۢ;->ۥۣ۟۟۠:Ljava/lang/String;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, LYue/ۥ۟ۨۢ;->ۥ۟۟۠ۤ:I

    .line 4
    iput v0, p0, LYue/ۥ۟ۨۢ;->ۥ۟۟۠ۥ:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 6
    const-string p1, ""

    iput-object p1, p0, LYue/ۥ۟ۨۢ;->ۥۣ۟۟۠:Ljava/lang/String;

    const/4 p1, -0x1

    .line 7
    iput p1, p0, LYue/ۥ۟ۨۢ;->ۥ۟۟۠ۤ:I

    .line 8
    iput p1, p0, LYue/ۥ۟ۨۢ;->ۥ۟۟۠ۥ:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 2

    .line 9
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "At line "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v1, ", column "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 10
    const-string p1, ""

    iput-object p1, p0, LYue/ۥ۟ۨۢ;->ۥۣ۟۟۠:Ljava/lang/String;

    .line 11
    iput p2, p0, LYue/ۥ۟ۨۢ;->ۥ۟۟۠ۤ:I

    .line 12
    iput p3, p0, LYue/ۥ۟ۨۢ;->ۥ۟۟۠ۥ:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 3

    .line 13
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "URI "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, " at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "At "

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "line "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v1, ", column "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 14
    const-string p2, ""

    iput-object p2, p0, LYue/ۥ۟ۨۢ;->ۥۣ۟۟۠:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 15
    iput-object p1, p0, LYue/ۥ۟ۨۢ;->ۥۣ۟۟۠:Ljava/lang/String;

    .line 16
    :cond_1
    iput p3, p0, LYue/ۥ۟ۨۢ;->ۥ۟۟۠ۤ:I

    .line 17
    iput p4, p0, LYue/ۥ۟ۨۢ;->ۥ۟۟۠ۥ:I

    return-void
.end method


# virtual methods
.method public ۥ()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۨۢ;->ۥ۟۟۠ۥ:I

    return v0
.end method

.method public ۥ۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۢ;->ۥۣ۟۟۠:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۨۢ;->ۥ۟۟۠ۤ:I

    return v0
.end method
