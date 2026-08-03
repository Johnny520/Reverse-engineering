.class public final LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۤۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;,
        LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟:LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ۟;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟۟۟:LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ۟;

    new-instance v0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2}, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sput-object v0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟۟۟۟:LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "prefix"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suffix"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟:Ljava/lang/String;

    iput-boolean p3, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟۟:Z

    return-void
.end method

.method public static final synthetic ۥ()LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;
    .locals 1

    sget-object v0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟۟۟۟:LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NumberHexFormat("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "append(\"NumberHexFormat(\")"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "append(\'\\n\')"

    invoke-static {v0, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "    "

    invoke-virtual {p0, v0, v3}, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v3, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۥ۟(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 5
    .param p1    # Ljava/lang/StringBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "sb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "indent"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "prefix = \""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "sb.append(indent).append\u2026fix = \\\"\").append(prefix)"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "\","

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "append(value)"

    invoke-static {p1, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0xa

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v3, "append(\'\\n\')"

    invoke-static {p1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "suffix = \""

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "sb.append(indent).append\u2026fix = \\\"\").append(suffix)"

    invoke-static {p1, v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "removeLeadingZeros = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p2, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟۟:Z

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    return-object p1
.end method

.method public final ۥ۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟۟:Z

    return v0
.end method

.method public final ۥ۟۟۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method
