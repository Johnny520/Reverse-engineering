.class public LYue/ۥۢ۠ۦۣ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public ۥ:Ljava/lang/String;

.field public ۥ۟:Ljava/lang/String;

.field public ۥ۟۟:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢ۠ۦۣ;->ۥ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۢ۠ۦۣ;->ۥ۟:Ljava/lang/String;

    iput p3, p0, LYue/ۥۢ۠ۦۣ;->ۥ۟۟:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v1, p0, LYue/ۥۢ۠ۦۣ;->ۥ۟۟:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v1, "]["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, LYue/ۥۢ۠ۦۣ;->ۥ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, LYue/ۥۢ۠ۦۣ;->ۥ۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()I
    .locals 1

    iget v0, p0, LYue/ۥۢ۠ۦۣ;->ۥ۟۟:I

    return v0
.end method

.method public ۥ۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۦۣ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۦۣ;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method
