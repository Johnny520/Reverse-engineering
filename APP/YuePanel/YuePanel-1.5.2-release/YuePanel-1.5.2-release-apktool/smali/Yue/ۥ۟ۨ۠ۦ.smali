.class public LYue/ۥ۟ۨ۠ۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۡۧ;


# static fields
.field public static final ۥ۟۟:LYue/ۥ۟ۨ۠ۦ;

.field public static final ۥ۟۟۟:LYue/ۥ۟ۨ۠ۦ;

.field public static final ۥ۟۟۟۟:LYue/ۥ۟ۨ۠ۦ;

.field public static final ۥ۟۟۟۠:LYue/ۥ۟ۨ۠ۦ;


# instance fields
.field public ۥ:I

.field public ۥ۟:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۟ۨ۠ۦ;

    const/4 v1, 0x0

    const-string v2, "FIXED"

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۨ۠ۦ;-><init>(ILjava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۨ۠ۦ;->ۥ۟۟:LYue/ۥ۟ۨ۠ۦ;

    new-instance v0, LYue/ۥ۟ۨ۠ۦ;

    const/4 v1, 0x1

    const-string v2, "REQUIRED"

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۨ۠ۦ;-><init>(ILjava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۨ۠ۦ;->ۥ۟۟۟:LYue/ۥ۟ۨ۠ۦ;

    new-instance v0, LYue/ۥ۟ۨ۠ۦ;

    const/4 v1, 0x2

    const-string v2, "IMPLIED"

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۨ۠ۦ;-><init>(ILjava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۨ۠ۦ;->ۥ۟۟۟۟:LYue/ۥ۟ۨ۠ۦ;

    new-instance v0, LYue/ۥ۟ۨ۠ۦ;

    const/4 v1, 0x3

    const-string v2, "VALUE"

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۨ۠ۦ;-><init>(ILjava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۨ۠ۦ;->ۥ۟۟۟۠:LYue/ۥ۟ۨ۠ۦ;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥ۟ۨ۠ۦ;->ۥ:I

    iput-object p2, p0, LYue/ۥ۟ۨ۠ۦ;->ۥ۟:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥ۟ۨ۠ۦ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥ۟ۨ۠ۦ;

    iget p1, p1, LYue/ۥ۟ۨ۠ۦ;->ۥ:I

    iget v1, p0, LYue/ۥ۟ۨ۠ۦ;->ۥ:I

    if-ne p1, v1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public ۥ(Ljava/io/PrintWriter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LYue/ۥ۟ۨ۠ۦ;->ۥ۟۟:LYue/ۥ۟ۨ۠ۦ;

    if-ne p0, v0, :cond_0

    const-string v0, " #FIXED"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, LYue/ۥ۟ۨ۠ۦ;->ۥ۟۟۟:LYue/ۥ۟ۨ۠ۦ;

    if-ne p0, v0, :cond_1

    const-string v0, " #REQUIRED"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v0, LYue/ۥ۟ۨ۠ۦ;->ۥ۟۟۟۟:LYue/ۥ۟ۨ۠ۦ;

    if-ne p0, v0, :cond_2

    const-string v0, " #IMPLIED"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method
