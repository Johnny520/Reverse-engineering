.class public final synthetic Lv8/p;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# static fields
.field public static final n:Lv8/p;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lv8/p;

    .line 2
    .line 3
    const-class v1, Ljava/io/File;

    .line 4
    .line 5
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v4, "<init>(Ljava/lang/String;)V"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    const-string v3, "<init>"

    .line 14
    .line 15
    invoke-direct/range {v0 .. v5}, Lgg/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lv8/p;->n:Lv8/p;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
