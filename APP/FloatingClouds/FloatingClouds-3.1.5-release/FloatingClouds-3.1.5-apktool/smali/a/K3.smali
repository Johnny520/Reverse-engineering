.class public final La/K3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/K3$a;,
        La/K3$b;
    }
.end annotation


# static fields
.field public static final a:La/K3$a;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;

.field public static final h:La/Me;

.field public static final i:La/Me;

.field public static volatile j:La/jc;

.field public static volatile k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ltop/mmjz/floatingclouds/bean/MaskItemBean;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile l:Ljava/lang/Boolean;

.field public static final m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/K3$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La/K3$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/K3;->a:La/K3$a;

    const-string v0, "maskList"

    sput-object v0, La/K3;->b:Ljava/lang/String;

    const-string v0, "options"

    sput-object v0, La/K3;->c:Ljava/lang/String;

    const-string v0, "config_mode_flag"

    sput-object v0, La/K3;->d:Ljava/lang/String;

    const-string v0, "hiddenOwnSnsIds"

    sput-object v0, La/K3;->e:Ljava/lang/String;

    const-string v0, "blockHotUpdate_reminder_acked"

    sput-object v0, La/K3;->f:Ljava/lang/String;

    const-string v0, "migration_guard"

    sput-object v0, La/K3;->g:Ljava/lang/String;

    new-instance v0, La/w3;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La/w3;-><init>(I)V

    new-instance v1, La/Me;

    invoke-direct {v1, v0}, La/Me;-><init>(La/s7;)V

    sput-object v1, La/K3;->h:La/Me;

    new-instance v0, La/w3;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, La/w3;-><init>(I)V

    new-instance v1, La/Me;

    invoke-direct {v1, v0}, La/Me;-><init>(La/s7;)V

    sput-object v1, La/K3;->i:La/Me;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, La/K3;->m:Ljava/util/ArrayList;

    return-void
.end method
