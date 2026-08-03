.class public abstract LJk;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LIt;

.field public static final b:LHt;

.field public static final c:Lbn;

.field public static final d:Lan;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v0}, LyD;->b(Ljava/lang/String;)Lz6;

    move-result-object v0

    new-instance v1, LIt;

    const-class v2, LGk;

    invoke-direct {v1, v2}, LIt;-><init>(Ljava/lang/Class;)V

    sput-object v1, LJk;->a:LIt;

    new-instance v1, LHt;

    invoke-direct {v1, v0}, LHt;-><init>(Lz6;)V

    sput-object v1, LJk;->b:LHt;

    new-instance v1, Lbn;

    const-class v2, LDk;

    invoke-direct {v1, v2}, Lbn;-><init>(Ljava/lang/Class;)V

    sput-object v1, LJk;->c:Lbn;

    new-instance v1, Lr1;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lr1;-><init>(I)V

    new-instance v2, Lan;

    invoke-direct {v2, v0, v1}, Lan;-><init>(Lz6;Lr1;)V

    sput-object v2, LJk;->d:Lan;

    return-void
.end method

.method public static a(Lrk;)Lv1;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget-object p0, Lv1;->t:Lv1;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to parse HashType: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lrk;->a()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lv1;->w:Lv1;

    return-object p0

    :cond_2
    sget-object p0, Lv1;->u:Lv1;

    return-object p0

    :cond_3
    sget-object p0, Lv1;->v:Lv1;

    return-object p0

    :cond_4
    sget-object p0, Lv1;->s:Lv1;

    return-object p0
.end method

.method public static b(Lyt;)Lv1;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Lv1;->y:Lv1;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to parse OutputPrefixType: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lyt;->b()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lv1;->A:Lv1;

    return-object p0

    :cond_2
    sget-object p0, Lv1;->z:Lv1;

    return-object p0

    :cond_3
    sget-object p0, Lv1;->x:Lv1;

    return-object p0
.end method
