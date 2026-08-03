.class public LYue/ۥۣ۟ۢ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۢ۠ۡ;
.implements LYue/ۥ۠ۧۧۧ;


# instance fields
.field public ۥ۟۟۠۟:Ljava/lang/String;

.field public ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

.field public ۥ۟۟۠ۡ:LYue/ۥۡۥۤۨ;

.field public ۥ۟۟۠ۢ:Ljava/lang/String;

.field public ۥۣ۟۟۠:I

.field public ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:I


# direct methods
.method public constructor <init>(LYue/ۥۡۥۤۨ;Ljava/lang/String;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 19
    iput v0, p0, LYue/ۥۣ۟ۢ۠;->ۥۣ۟۟۠:I

    .line 20
    iput v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۤ:I

    .line 21
    iput v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۥ:I

    const/4 v0, 0x0

    .line 22
    iput v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۦ:I

    .line 23
    iput-object p1, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    .line 24
    iput-object p2, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۟:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput v0, p0, LYue/ۥۣ۟ۢ۠;->ۥۣ۟۟۠:I

    .line 12
    iput v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۤ:I

    .line 13
    iput v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۥ:I

    const/4 v0, 0x0

    .line 14
    iput v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۦ:I

    .line 15
    const-string v0, ""

    if-nez p1, :cond_0

    move-object p1, v0

    .line 16
    :cond_0
    new-instance v1, LYue/ۥۡۥۤۨ;

    invoke-direct {v1, v0, p2, p1}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    .line 17
    iput-object p3, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۟:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, LYue/ۥۣ۟ۢ۠;->ۥۣ۟۟۠:I

    .line 3
    iput v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۤ:I

    .line 4
    iput v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۥ:I

    const/4 v0, 0x0

    .line 5
    iput v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۦ:I

    if-nez p1, :cond_0

    .line 6
    const-string p1, ""

    .line 7
    :cond_0
    new-instance v0, LYue/ۥۡۥۤۨ;

    invoke-direct {v0, p2, p3, p1}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    .line 8
    iput-object p4, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۟:Ljava/lang/String;

    .line 9
    new-instance p1, LYue/ۥۡۥۤۨ;

    invoke-direct {p1, p5}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۡ:LYue/ۥۡۥۤۨ;

    return-void
.end method

.method public static ۥ۟۟ۥۨ(Ljava/io/Writer;C)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "&#"

    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 p1, 0x3b

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(I)V

    return-void
.end method


# virtual methods
.method public getName()LYue/ۥۡۥۤۨ;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۟:Ljava/lang/String;

    return-object v0
.end method

.method public isAttribute()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\'"

    const-string v2, "=\'"

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v0

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "[\'"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v3, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    invoke-virtual {v3}, LYue/ۥۡۥۤۨ;->ۥ۟()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "\']:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v3, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    invoke-virtual {v3}, LYue/ۥۡۥۤۨ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, ":"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v3, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    invoke-virtual {v3}, LYue/ۥۡۥۤۨ;->ۥ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۟:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v3, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    invoke-virtual {v3}, LYue/ۥۡۥۤۨ;->ۥ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۟:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟ۥ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ۟()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۦ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟ۨ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۠()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method public ۥ۟۟۠۟()LYue/ۥ۠ۧۧۧ;
    .locals 0

    return-object p0
.end method

.method public ۥ۟۟۠ۦ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟۠ۧ()I
    .locals 1

    iget v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۥ:I

    return v0
.end method

.method public ۥ۟۟۠ۨ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۡۡ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۡۥ(Ljava/io/Writer;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v0, 0x3a

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    :goto_0
    iget-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, "=\""

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۟:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x22

    if-lez v1, :cond_9

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    const/16 v5, 0x20

    const/16 v6, 0x3c

    const/16 v7, 0x26

    if-ge v4, v1, :cond_2

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-eq v8, v2, :cond_2

    if-eq v8, v7, :cond_2

    if-eq v8, v6, :cond_2

    if-ge v8, v5, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-ne v4, v1, :cond_3

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_5

    :cond_3
    if-lez v4, :cond_4

    invoke-virtual {p1, v0, v3, v4}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    :cond_4
    :goto_3
    if-ge v4, v1, :cond_9

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v2, :cond_8

    if-eq v3, v7, :cond_7

    if-eq v3, v6, :cond_6

    if-ge v3, v5, :cond_5

    invoke-static {p1, v3}, LYue/ۥۣ۟ۢ۠;->ۥ۟۟ۥۨ(Ljava/io/Writer;C)V

    goto :goto_4

    :cond_5
    invoke-virtual {p1, v3}, Ljava/io/Writer;->write(I)V

    goto :goto_4

    :cond_6
    const-string v3, "&lt;"

    invoke-virtual {p1, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    const-string v3, "&amp;"

    invoke-virtual {p1, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    const-string v3, "&quot;"

    invoke-virtual {p1, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_9
    :goto_5
    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_6
    new-instance v0, LYue/ۥۢۦۢۢ;

    invoke-direct {v0, p1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public ۥ۟۟ۢۡ()LYue/ۥۡۥۤۨ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟ۢۤ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۢۧ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢۨ()LYue/ۥ۠ۡ;
    .locals 2

    new-instance v0, Ljava/lang/ClassCastException;

    const-string v1, "cannnot cast AttributeBase to EndElement"

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥۣ۟۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۤ:I

    return v0
.end method

.method public ۥۣ۟۟ۢ()Ljava/lang/String;
    .locals 1

    const-string v0, "CDATA"

    return-object v0
.end method

.method public ۥۣۣ۟۟()LYue/ۥۣ۟ۤۥ;
    .locals 2

    new-instance v0, Ljava/lang/ClassCastException;

    const-string v1, "cannnot cast AttributeBase to Characters"

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥۣ۟۟ۦ()LYue/ۥۢ۟ۨۤ;
    .locals 2

    new-instance v0, Ljava/lang/ClassCastException;

    const-string v1, "cannnot cast AttributeBase to StartElement"

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥۣ۟۟ۧ()I
    .locals 1

    iget v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۦ:I

    return v0
.end method

.method public ۥۣ۟۟ۤ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۤۤ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۤۦ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۤۧ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۢ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟ۤۨ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟ۥ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟ۥ۟()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۥ۠()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۥۡ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۥۢ()V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۥۣ(I)V
    .locals 0

    iput p1, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۦ:I

    return-void
.end method

.method public ۥ۟۟ۥۤ(I)V
    .locals 0

    iput p1, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۥ:I

    return-void
.end method

.method public ۥ۟۟ۥۥ(I)V
    .locals 0

    iput p1, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۤ:I

    return-void
.end method

.method public ۥ۟۟ۥۦ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠ۢ:Ljava/lang/String;

    return-void
.end method

.method public ۥ۟۟ۥۧ(Ljava/lang/String;)V
    .locals 2

    new-instance v0, LYue/ۥۡۥۤۨ;

    iget-object v1, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    invoke-virtual {v1}, LYue/ۥۡۥۤۨ;->ۥ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟۟۠۠:LYue/ۥۡۥۤۨ;

    return-void
.end method
