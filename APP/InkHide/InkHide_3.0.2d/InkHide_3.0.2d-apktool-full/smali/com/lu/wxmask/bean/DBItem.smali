.class public final Lcom/lu/wxmask/bean/DBItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private name:Ljava/lang/String;

.field private password:Ljava/lang/String;

.field private sqliteDatabase:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/lu/wxmask/bean/DBItem;->name:Ljava/lang/String;

    iput-object p2, p0, Lcom/lu/wxmask/bean/DBItem;->password:Ljava/lang/String;

    iput-object p3, p0, Lcom/lu/wxmask/bean/DBItem;->sqliteDatabase:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILN0/e;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/lu/wxmask/bean/DBItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/DBItem;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPassword()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/DBItem;->password:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSqliteDatabase()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/DBItem;->sqliteDatabase:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/DBItem;->name:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setPassword(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lu/wxmask/bean/DBItem;->password:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSqliteDatabase(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lu/wxmask/bean/DBItem;->sqliteDatabase:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method
