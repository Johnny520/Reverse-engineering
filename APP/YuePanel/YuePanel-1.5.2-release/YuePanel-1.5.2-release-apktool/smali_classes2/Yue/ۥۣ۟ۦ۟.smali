.class public final LYue/ۥۣ۟ۦ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟ۦ۟$ۥ;,
        LYue/ۥۣ۟ۦ۟$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۨ:LYue/ۥۣ۟ۦ۟$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠:LYue/ۥۣ۟ۦ۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠۟:LYue/ۥۣ۟ۦ۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:Z

.field public final ۥ۟:Z

.field public final ۥ۟۟:I

.field public final ۥ۟۟۟:I

.field public final ۥ۟۟۟۟:Z

.field public final ۥ۟۟۟۠:Z

.field public final ۥ۟۟۟ۡ:Z

.field public final ۥ۟۟۟ۢ:I

.field public final ۥۣ۟۟۟:I

.field public final ۥ۟۟۟ۤ:Z

.field public final ۥ۟۟۟ۥ:Z

.field public final ۥ۟۟۟ۦ:Z

.field public ۥ۟۟۟ۧ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥۣ۟ۦ۟$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣ۟ۦ۟$ۥ۟;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۨ:LYue/ۥۣ۟ۦ۟$ۥ۟;

    new-instance v0, LYue/ۥۣ۟ۦ۟$ۥ;

    invoke-direct {v0}, LYue/ۥۣ۟ۦ۟$ۥ;-><init>()V

    invoke-virtual {v0}, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟ۡ()LYue/ۥۣ۟ۦ۟$ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ()LYue/ۥۣ۟ۦ۟;

    move-result-object v0

    sput-object v0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۠:LYue/ۥۣ۟ۦ۟;

    new-instance v0, LYue/ۥۣ۟ۦ۟$ۥ;

    invoke-direct {v0}, LYue/ۥۣ۟ۦ۟$ۥ;-><init>()V

    invoke-virtual {v0}, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟ۤ()LYue/ۥۣ۟ۦ۟$ۥ;

    move-result-object v0

    const v1, 0x7fffffff

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟۟(ILjava/util/concurrent/TimeUnit;)LYue/ۥۣ۟ۦ۟$ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ()LYue/ۥۣ۟ۦ۟;

    move-result-object v0

    sput-object v0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۠۟:LYue/ۥۣ۟ۦ۟;

    return-void
.end method

.method public constructor <init>(ZZIIZZZIIZZZLjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, LYue/ۥۣ۟ۦ۟;->ۥ:Z

    .line 4
    iput-boolean p2, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟:Z

    .line 5
    iput p3, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟:I

    .line 6
    iput p4, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟:I

    .line 7
    iput-boolean p5, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟۟:Z

    .line 8
    iput-boolean p6, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟۠:Z

    .line 9
    iput-boolean p7, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۡ:Z

    .line 10
    iput p8, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۢ:I

    .line 11
    iput p9, p0, LYue/ۥۣ۟ۦ۟;->ۥۣ۟۟۟:I

    .line 12
    iput-boolean p10, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۤ:Z

    .line 13
    iput-boolean p11, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۥ:Z

    .line 14
    iput-boolean p12, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۦ:Z

    .line 15
    iput-object p13, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۧ:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZZIIZZZIIZZZLjava/lang/String;LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p13}, LYue/ۥۣ۟ۦ۟;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    return-void
.end method

.method public static final ۥ۟۟۠ۥ(LYue/ۥ۠ۤۢۢ;)LYue/ۥۣ۟ۦ۟;
    .locals 1
    .param p0    # LYue/ۥ۠ۤۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۨ:LYue/ۥۣ۟ۦ۟$ۥ۟;

    invoke-virtual {v0, p0}, LYue/ۥۣ۟ۦ۟$ۥ۟;->ۥ۟۟(LYue/ۥ۠ۤۢۢ;)LYue/ۥۣ۟ۦ۟;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۧ:Ljava/lang/String;

    if-nez v0, :cond_d

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ:Z

    if-eqz v1, :cond_0

    const-string v1, "no-cache, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-boolean v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟:Z

    if-eqz v1, :cond_1

    const-string v1, "no-store, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟:I

    const-string v2, ", "

    const/4 v3, -0x1

    if-eq v1, v3, :cond_2

    const-string v1, "max-age="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟:I

    if-eq v1, v3, :cond_3

    const-string v1, "s-maxage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-boolean v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟۟:Z

    if-eqz v1, :cond_4

    const-string v1, "private, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-boolean v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟۠:Z

    if-eqz v1, :cond_5

    const-string v1, "public, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-boolean v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۡ:Z

    if-eqz v1, :cond_6

    const-string v1, "must-revalidate, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۢ:I

    if-eq v1, v3, :cond_7

    const-string v1, "max-stale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۢ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    iget v1, p0, LYue/ۥۣ۟ۦ۟;->ۥۣ۟۟۟:I

    if-eq v1, v3, :cond_8

    const-string v1, "min-fresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۣ۟ۦ۟;->ۥۣ۟۟۟:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    iget-boolean v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۤ:Z

    if-eqz v1, :cond_9

    const-string v1, "only-if-cached, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    iget-boolean v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۥ:Z

    if-eqz v1, :cond_a

    const-string v1, "no-transform, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a
    iget-boolean v1, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۦ:Z

    if-eqz v1, :cond_b

    const-string v1, "immutable, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_c

    const-string v0, ""

    return-object v0

    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۧ:Ljava/lang/String;

    :cond_d
    return-object v0
.end method

.method public final ۥ()Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "immutable"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_immutable"
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۦ:Z

    return v0
.end method

.method public final ۥ۟()I
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "maxAgeSeconds"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_maxAgeSeconds"
    .end annotation

    iget v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟:I

    return v0
.end method

.method public final ۥ۟۟()I
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "maxStaleSeconds"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_maxStaleSeconds"
    .end annotation

    iget v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۢ:I

    return v0
.end method

.method public final ۥ۟۟۟()I
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "minFreshSeconds"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_minFreshSeconds"
    .end annotation

    iget v0, p0, LYue/ۥۣ۟ۦ۟;->ۥۣ۟۟۟:I

    return v0
.end method

.method public final ۥ۟۟۟۟()Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "mustRevalidate"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_mustRevalidate"
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۡ:Z

    return v0
.end method

.method public final ۥ۟۟۟۠()Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "noCache"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_noCache"
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ:Z

    return v0
.end method

.method public final ۥ۟۟۟ۡ()Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "noStore"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_noStore"
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟:Z

    return v0
.end method

.method public final ۥ۟۟۟ۢ()Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "noTransform"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_noTransform"
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۥ:Z

    return v0
.end method

.method public final ۥۣ۟۟۟()Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "onlyIfCached"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_onlyIfCached"
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۤ:Z

    return v0
.end method

.method public final ۥ۟۟۟ۤ()I
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "sMaxAgeSeconds"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_sMaxAgeSeconds"
    .end annotation

    iget v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟:I

    return v0
.end method

.method public final ۥ۟۟۟ۥ()Z
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "immutable"
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۦ:Z

    return v0
.end method

.method public final ۥ۟۟۟ۦ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟۟:Z

    return v0
.end method

.method public final ۥ۟۟۟ۧ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟۠:Z

    return v0
.end method

.method public final ۥ۟۟۟ۨ()I
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "maxAgeSeconds"
    .end annotation

    iget v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟:I

    return v0
.end method

.method public final ۥ۟۟۠()I
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "maxStaleSeconds"
    .end annotation

    iget v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۢ:I

    return v0
.end method

.method public final ۥ۟۟۠۟()I
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "minFreshSeconds"
    .end annotation

    iget v0, p0, LYue/ۥۣ۟ۦ۟;->ۥۣ۟۟۟:I

    return v0
.end method

.method public final ۥ۟۟۠۠()Z
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "mustRevalidate"
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۡ:Z

    return v0
.end method

.method public final ۥ۟۟۠ۡ()Z
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "noCache"
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ:Z

    return v0
.end method

.method public final ۥ۟۟۠ۢ()Z
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "noStore"
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟:Z

    return v0
.end method

.method public final ۥۣ۟۟۠()Z
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "noTransform"
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۥ:Z

    return v0
.end method

.method public final ۥ۟۟۠ۤ()Z
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "onlyIfCached"
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۤ:Z

    return v0
.end method

.method public final ۥ۟۟۠ۦ()I
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "sMaxAgeSeconds"
    .end annotation

    iget v0, p0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟:I

    return v0
.end method
