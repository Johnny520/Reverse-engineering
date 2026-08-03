.class public final LYue/ۥ۟ۢۦۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۢۦۨ$ۥ;,
        LYue/ۥ۟ۢۦۨ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟:LYue/ۥۢۡ۠۠;

.field public static final ۥ۟۟۟۟:C = '\u202a'

.field public static final ۥ۟۟۟۠:C = '\u202b'

.field public static final ۥ۟۟۟ۡ:C = '\u202c'

.field public static final ۥ۟۟۟ۢ:C = '\u200e'

.field public static final ۥۣ۟۟۟:C = '\u200f'

.field public static final ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static final ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static final ۥ۟۟۟ۦ:Ljava/lang/String; = ""

.field public static final ۥ۟۟۟ۧ:I = 0x2

.field public static final ۥ۟۟۟ۨ:I = 0x2

.field public static final ۥ۟۟۠:LYue/ۥ۟ۢۦۨ;

.field public static final ۥ۟۟۠۟:LYue/ۥ۟ۢۦۨ;

.field public static final ۥ۟۟۠۠:I = -0x1

.field public static final ۥ۟۟۠ۡ:I = 0x0

.field public static final ۥ۟۟۠ۢ:I = 0x1


# instance fields
.field public final ۥ:Z

.field public final ۥ۟:I

.field public final ۥ۟۟:LYue/ۥۢۡ۠۠;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, LYue/ۥۢۡ۠ۡ;->ۥ۟۟:LYue/ۥۢۡ۠۠;

    sput-object v0, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟:LYue/ۥۢۡ۠۠;

    const/16 v1, 0x200e

    invoke-static {v1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v1

    sput-object v1, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۤ:Ljava/lang/String;

    const/16 v1, 0x200f

    invoke-static {v1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v1

    sput-object v1, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۥ:Ljava/lang/String;

    new-instance v1, LYue/ۥ۟ۢۦۨ;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3, v0}, LYue/ۥ۟ۢۦۨ;-><init>(ZILYue/ۥۢۡ۠۠;)V

    sput-object v1, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۠:LYue/ۥ۟ۢۦۨ;

    new-instance v1, LYue/ۥ۟ۢۦۨ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v3, v0}, LYue/ۥ۟ۢۦۨ;-><init>(ZILYue/ۥۢۡ۠۠;)V

    sput-object v1, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۠۟:LYue/ۥ۟ۢۦۨ;

    return-void
.end method

.method public constructor <init>(ZILYue/ۥۢۡ۠۠;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LYue/ۥ۟ۢۦۨ;->ۥ:Z

    iput p2, p0, LYue/ۥ۟ۢۦۨ;->ۥ۟:I

    iput-object p3, p0, LYue/ۥ۟ۢۦۨ;->ۥ۟۟:LYue/ۥۢۡ۠۠;

    return-void
.end method

.method public static ۥ(Ljava/lang/CharSequence;)I
    .locals 2

    new-instance v0, LYue/ۥ۟ۢۦۨ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LYue/ۥ۟ۢۦۨ$ۥ۟;-><init>(Ljava/lang/CharSequence;Z)V

    invoke-virtual {v0}, LYue/ۥ۟ۢۦۨ$ۥ۟;->ۥ۟۟۟()I

    move-result p0

    return p0
.end method

.method public static ۥ۟(Ljava/lang/CharSequence;)I
    .locals 2

    new-instance v0, LYue/ۥ۟ۢۦۨ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LYue/ۥ۟ۢۦۨ$ۥ۟;-><init>(Ljava/lang/CharSequence;Z)V

    invoke-virtual {v0}, LYue/ۥ۟ۢۦۨ$ۥ۟;->ۥ۟۟۟۟()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟()LYue/ۥ۟ۢۦۨ;
    .locals 1

    new-instance v0, LYue/ۥ۟ۢۦۨ$ۥ;

    invoke-direct {v0}, LYue/ۥ۟ۢۦۨ$ۥ;-><init>()V

    invoke-virtual {v0}, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ()LYue/ۥ۟ۢۦۨ;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۟(Ljava/util/Locale;)LYue/ۥ۟ۢۦۨ;
    .locals 1

    new-instance v0, LYue/ۥ۟ۢۦۨ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۢۦۨ$ۥ;-><init>(Ljava/util/Locale;)V

    invoke-virtual {v0}, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ()LYue/ۥ۟ۢۦۨ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۟(Z)LYue/ۥ۟ۢۦۨ;
    .locals 1

    new-instance v0, LYue/ۥ۟ۢۦۨ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۢۦۨ$ۥ;-><init>(Z)V

    invoke-virtual {v0}, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ()LYue/ۥ۟ۢۦۨ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۤ(Ljava/util/Locale;)Z
    .locals 1

    invoke-static {p0}, LYue/ۥۢۡۡ;->ۥ(Ljava/util/Locale;)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public ۥ۟۟۟۠()Z
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۦۨ;->ۥ۟:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/CharSequence;)Z
    .locals 3

    iget-object v0, p0, LYue/ۥ۟ۢۦۨ;->ۥ۟۟:LYue/ۥۢۡ۠۠;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-interface {v0, p1, v2, v1}, LYue/ۥۢۡ۠۠;->ۥ۟(Ljava/lang/CharSequence;II)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۡ(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public ۥۣ۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۟ۢۦۨ;->ۥ:Z

    return v0
.end method

.method public final ۥ۟۟۟ۥ(Ljava/lang/CharSequence;LYue/ۥۢۡ۠۠;)Ljava/lang/String;
    .locals 2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-interface {p2, p1, v1, v0}, LYue/ۥۢۡ۠۠;->ۥ۟(Ljava/lang/CharSequence;II)Z

    move-result p2

    iget-boolean v0, p0, LYue/ۥ۟ۢۦۨ;->ۥ:Z

    if-nez v0, :cond_1

    if-nez p2, :cond_0

    invoke-static {p1}, LYue/ۥ۟ۢۦۨ;->ۥ۟(Ljava/lang/CharSequence;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    :cond_0
    sget-object p1, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۤ:Ljava/lang/String;

    return-object p1

    :cond_1
    iget-boolean v0, p0, LYue/ۥ۟ۢۦۨ;->ۥ:Z

    if-eqz v0, :cond_3

    if-eqz p2, :cond_2

    invoke-static {p1}, LYue/ۥ۟ۢۦۨ;->ۥ۟(Ljava/lang/CharSequence;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_3

    :cond_2
    sget-object p1, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۥ:Ljava/lang/String;

    return-object p1

    :cond_3
    const-string p1, ""

    return-object p1
.end method

.method public final ۥ۟۟۟ۦ(Ljava/lang/CharSequence;LYue/ۥۢۡ۠۠;)Ljava/lang/String;
    .locals 2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-interface {p2, p1, v1, v0}, LYue/ۥۢۡ۠۠;->ۥ۟(Ljava/lang/CharSequence;II)Z

    move-result p2

    iget-boolean v0, p0, LYue/ۥ۟ۢۦۨ;->ۥ:Z

    if-nez v0, :cond_1

    if-nez p2, :cond_0

    invoke-static {p1}, LYue/ۥ۟ۢۦۨ;->ۥ(Ljava/lang/CharSequence;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    :cond_0
    sget-object p1, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۤ:Ljava/lang/String;

    return-object p1

    :cond_1
    iget-boolean v0, p0, LYue/ۥ۟ۢۦۨ;->ۥ:Z

    if-eqz v0, :cond_3

    if-eqz p2, :cond_2

    invoke-static {p1}, LYue/ۥ۟ۢۦۨ;->ۥ(Ljava/lang/CharSequence;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_3

    :cond_2
    sget-object p1, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۥ:Ljava/lang/String;

    return-object p1

    :cond_3
    const-string p1, ""

    return-object p1
.end method

.method public ۥ۟۟۟ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۢۦۨ;->ۥ۟۟:LYue/ۥۢۡ۠۠;

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۠(Ljava/lang/CharSequence;LYue/ۥۢۡ۠۠;Z)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۨ(Ljava/lang/CharSequence;LYue/ۥۢۡ۠۠;)Ljava/lang/CharSequence;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۠(Ljava/lang/CharSequence;LYue/ۥۢۡ۠۠;Z)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠(Ljava/lang/CharSequence;LYue/ۥۢۡ۠۠;Z)Ljava/lang/CharSequence;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {p2, p1, v0, v1}, LYue/ۥۢۡ۠۠;->ۥ۟(Ljava/lang/CharSequence;II)Z

    move-result p2

    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    invoke-virtual {p0}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟۠()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p3, :cond_2

    if-eqz p2, :cond_1

    sget-object v1, LYue/ۥۢۡ۠ۡ;->ۥ۟:LYue/ۥۢۡ۠۠;

    goto :goto_0

    :cond_1
    sget-object v1, LYue/ۥۢۡ۠ۡ;->ۥ:LYue/ۥۢۡ۠۠;

    :goto_0
    invoke-virtual {p0, p1, v1}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۦ(Ljava/lang/CharSequence;LYue/ۥۢۡ۠۠;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_2
    iget-boolean v1, p0, LYue/ۥ۟ۢۦۨ;->ۥ:Z

    if-eq p2, v1, :cond_4

    if-eqz p2, :cond_3

    const/16 v1, 0x202b

    goto :goto_1

    :cond_3
    const/16 v1, 0x202a

    :goto_1
    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    const/16 v1, 0x202c

    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    goto :goto_2

    :cond_4
    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :goto_2
    if-eqz p3, :cond_6

    if-eqz p2, :cond_5

    sget-object p2, LYue/ۥۢۡ۠ۡ;->ۥ۟:LYue/ۥۢۡ۠۠;

    goto :goto_3

    :cond_5
    sget-object p2, LYue/ۥۢۡ۠ۡ;->ۥ:LYue/ۥۢۡ۠۠;

    :goto_3
    invoke-virtual {p0, p1, p2}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۥ(Ljava/lang/CharSequence;LYue/ۥۢۡ۠۠;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_6
    return-object v0
.end method

.method public ۥ۟۟۠۟(Ljava/lang/CharSequence;Z)Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢۦۨ;->ۥ۟۟:LYue/ۥۢۡ۠۠;

    invoke-virtual {p0, p1, v0, p2}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۠(Ljava/lang/CharSequence;LYue/ۥۢۡ۠۠;Z)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠۠(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۢۦۨ;->ۥ۟۟:LYue/ۥۢۡ۠۠;

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۠ۢ(Ljava/lang/String;LYue/ۥۢۡ۠۠;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۡ(Ljava/lang/String;LYue/ۥۢۡ۠۠;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۠ۢ(Ljava/lang/String;LYue/ۥۢۡ۠۠;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۢ(Ljava/lang/String;LYue/ۥۢۡ۠۠;Z)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۠(Ljava/lang/CharSequence;LYue/ۥۢۡ۠۠;Z)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟۠(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢۦۨ;->ۥ۟۟:LYue/ۥۢۡ۠۠;

    invoke-virtual {p0, p1, v0, p2}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۠ۢ(Ljava/lang/String;LYue/ۥۢۡ۠۠;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
