.class public final LYue/ۥۡۦۣۢ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۣۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۦۣۢ$ۥ۟$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۥ:LYue/ۥۡۦۣۢ$ۥ۟$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۦ:J


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۦۣۢ$ۥ۟$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۡۦۣۢ$ۥ۟$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۡۦۣۢ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥۡۦۣۢ$ۥ۟$ۥ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "pattern"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦۣۢ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/String;

    iput p2, p0, LYue/ۥۡۦۣۢ$ۥ۟;->ۥ۟۟۠ۤ:I

    return-void
.end method


# virtual methods
.method public final ۥ()I
    .locals 1

    iget v0, p0, LYue/ۥۡۦۣۢ$ۥ۟;->ۥ۟۟۠ۤ:I

    return v0
.end method

.method public final ۥ۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۢ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/lang/Object;
    .locals 3

    new-instance v0, LYue/ۥۡۦۣۢ;

    iget-object v1, p0, LYue/ۥۡۦۣۢ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/String;

    iget v2, p0, LYue/ۥۡۦۣۢ$ۥ۟;->ۥ۟۟۠ۤ:I

    invoke-static {v1, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    const-string v2, "compile(pattern, flags)"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LYue/ۥۡۦۣۢ;-><init>(Ljava/util/regex/Pattern;)V

    return-object v0
.end method
