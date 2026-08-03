.class public LYue/ۥ۠ۤۨۤ;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field public final ۥۣ۟۟۠:I

.field public final ۥ۟۟۠ۤ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Status="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", URL=["

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput p2, p0, LYue/ۥ۠ۤۨۤ;->ۥۣ۟۟۠:I

    iput-object p3, p0, LYue/ۥ۠ۤۨۤ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public ۥ()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۤۨۤ;->ۥۣ۟۟۠:I

    return v0
.end method

.method public ۥ۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨۤ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-object v0
.end method
