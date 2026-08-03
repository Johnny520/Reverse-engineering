.class public final Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/lua/loader/ScriptPackageManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ScriptPackage"
.end annotation


# instance fields
.field private final author:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private isRunning:Z

.field private final name:Ljava/lang/String;

.field private final path:Ljava/lang/String;

.field private final version:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    const-wide v0, -0x15b8ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15b92fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15b97fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15b9ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15ba6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15bb2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->name:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->version:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->author:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->description:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->path:Ljava/lang/String;

    .line 8
    iput-boolean p7, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->isRunning:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILOc;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move/from16 v8, p7

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {v1 .. v8}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->version:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->author:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->description:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->path:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->isRunning:Z

    :cond_6
    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->isRunning:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;
    .locals 10

    const-wide v0, -0x15a53fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15a56fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15a5bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15a63fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15a6afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15a76fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    invoke-direct/range {v2 .. v9}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->id:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->version:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->version:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->author:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->author:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->description:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->description:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->path:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->path:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->isRunning:Z

    iget-boolean p1, p1, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->isRunning:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final exists()Z
    .locals 2

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->path:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getMainFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getAuthor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescFile()Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->path:Ljava/lang/String;

    const-wide v2, -0x15a4afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInfoFile()Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->path:Ljava/lang/String;

    const-wide v2, -0x15a40fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getMainFile()Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->path:Ljava/lang/String;

    const-wide v2, -0x15bb7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->name:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->version:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->author:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->description:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->path:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-boolean v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->isRunning:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isRunning()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->isRunning:Z

    return v0
.end method

.method public final setRunning(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->isRunning:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x15a7bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->id:Ljava/lang/String;

    const-wide v2, -0x15a0dfffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->name:Ljava/lang/String;

    const-wide v2, -0x15a15fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->version:Ljava/lang/String;

    const-wide v2, -0x15a20fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->author:Ljava/lang/String;

    const-wide v2, -0x15a2afffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->description:Ljava/lang/String;

    const-wide v2, -0x15a39fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->path:Ljava/lang/String;

    const-wide v2, -0x15ac1fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-boolean v1, p0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->isRunning:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
