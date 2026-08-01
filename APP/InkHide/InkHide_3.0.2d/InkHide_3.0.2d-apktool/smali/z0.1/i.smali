.class public abstract Lz0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z

.field public static volatile b:Lcom/lu/wxmask/bean/OptionData;

.field public static volatile c:Ljava/util/List;

.field public static volatile d:Ljava/util/Set;

.field public static volatile e:Ljava/util/Set;

.field public static volatile f:Ljava/lang/String;

.field public static final g:Ljava/lang/Object;

.field public static final h:Lz0/f;

.field public static final i:LE0/f;

.field public static final j:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz0/i;->g:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Lz0/f;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lz0/i;->h:Lz0/f;

    .line 14
    .line 15
    new-instance v0, Lr0/n1;

    .line 16
    .line 17
    const/16 v1, 0x18

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lr0/n1;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, LE0/f;

    .line 23
    .line 24
    invoke-direct {v1, v0}, LE0/f;-><init>(LM0/a;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lz0/i;->i:LE0/f;

    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lz0/i;->j:Ljava/util/ArrayList;

    .line 35
    .line 36
    return-void
.end method
