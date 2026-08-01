.class public final synthetic Lo0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/io/File;

.field public final synthetic d:LM0/p;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;LM0/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lo0/c;->b:Ljava/lang/String;

    iput-object p3, p0, Lo0/c;->c:Ljava/io/File;

    iput-object p4, p0, Lo0/c;->d:LM0/p;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, LD0/c;

    iget-object v0, p0, Lo0/c;->c:Ljava/io/File;

    iget-object v1, p0, Lo0/c;->a:Ljava/lang/String;

    iget-object v2, p0, Lo0/c;->b:Ljava/lang/String;

    iget-object v3, p0, Lo0/c;->d:LM0/p;

    invoke-static {v1, v2, v0, v3, p1}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;LM0/p;LD0/c;)LE0/i;

    move-result-object p1

    return-object p1
.end method
