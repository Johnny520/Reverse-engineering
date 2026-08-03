from com.pnfsoftware.jeb.client.api import IScript


class JebProbe(IScript):
    def run(self, ctx):
        out = []
        out.append('VERSION=%s' % ctx.getSoftwareVersion())
        out.append('ARGS=%s' % ctx.getArguments())
        out.append('BASE=%s' % ctx.getBaseDirectory())
        prj = ctx.getMainProject()
        out.append('PROJECT=%s' % prj)
        if prj:
            methods = sorted(set([m.getName() for m in prj.getClass().getMethods()]))
            out.append('PROJECT_CLASS=%s' % prj.getClass().getName())
            out.append('PROJECT_METHODS=%s' % methods)
            for name in ('getLiveArtifact', 'getUnits', 'getArtifacts'):
                try:
                    value = getattr(prj, name)()
                    out.append('%s=%s TYPE=%s' % (name, value, value.getClass().getName() if value else None))
                except Exception, e:
                    out.append('%s_ERROR=%s' % (name, e))
        f = open('WCGlass_output/JebProbe_result.txt', 'w')
        f.write('\n'.join(out))
        f.close()
